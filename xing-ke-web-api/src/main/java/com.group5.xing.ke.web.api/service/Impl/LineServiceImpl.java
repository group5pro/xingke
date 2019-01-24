package com.group5.xing.ke.web.api.service.Impl;

import com.group5.xing.ke.web.api.DTO.DescDTO;
import com.group5.xing.ke.web.api.DTO.LineDTO;
import com.group5.xing.ke.web.api.DTO.TbLine;
import com.group5.xing.ke.web.api.DTO.TbProduct;
import com.group5.xing.ke.web.api.dao.LineDao;
import com.group5.xing.ke.web.api.service.LineService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class LineServiceImpl implements LineService {
    @Autowired
    LineDao dao;



    @Override
    public LineDTO selectDesc(Long pid) {
        LineDTO lineDTO = new LineDTO();
        LineDTO line = dao.select(pid);
        BeanUtils.copyProperties(line,lineDTO);


        List<DescDTO> list = new ArrayList<>();
        TbLine liness = dao.getTbLine(pid);
        System.out.println(liness.getFeature1Id());
            DescDTO descDTO1 = dao.selectByDesc(liness.getFeature1Id());
            DescDTO descDTO2 = dao.selectByDesc(liness.getFeature2Id());
        DescDTO descDTO3 = dao.selectByDesc(liness.getFeature3Id());
        DescDTO descDTO4 = dao.selectByDesc(liness.getFeature4Id());
        DescDTO descDTO5 = dao.selectByDesc(liness.getFeature5Id());
        DescDTO descDTO6 = dao.selectByDesc(liness.getFeature6Id());
        DescDTO descDTO7 = dao.selectByDesc(liness.getFeature7Id());
        DescDTO descDTO8 = dao.selectByDesc(liness.getFeature8Id());

        list.add(descDTO1);
        list.add(descDTO2);
        list.add(descDTO3);
        list.add(descDTO4);
        list.add(descDTO5);
        list.add(descDTO6);
        list.add(descDTO7);
        list.add(descDTO8);


        lineDTO.setDay(list);
        return lineDTO;
    }

    @Override
    public List<TbProduct> selectProduct() {
        return dao.selectProduct();
    }
}
