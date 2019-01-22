package com.group5.xing.ke.web.api.service.Impl;

import com.group5.xing.ke.domain.TbArtcleCollect;
import com.group5.xing.ke.web.api.DTO.TbArtcleDTO;
import com.group5.xing.ke.web.api.dao.ArticleDao;
import com.group5.xing.ke.web.api.service.ArticleService;
import com.group5.xing.ke.domain.TbArtcle;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    ArticleDao dao;

    @Override
    public List<TbArtcleDTO> select() {
        List<TbArtcleDTO> dtos = new ArrayList<>();
        List<TbArtcle> tbArtcles = dao.select();
        for (TbArtcle tbArtcle : tbArtcles) {
            TbArtcleDTO tbArtcleDTO = new TbArtcleDTO();
            tbArtcleDTO.setId(dao.selectGetId().getId());
            tbArtcleDTO.setContent(dao.selectGetContent().getContent());
            BeanUtils.copyProperties(tbArtcle, tbArtcleDTO);
            dtos.add(tbArtcleDTO);
        }
//        return dtos;
//        for (TbArtcleDTO tbArtcleDTO : dtos) {
//            tbArtcleDTO.setId(dao.selectGetId().getId());
//            tbArtcleDTO.setContent(dao.selectGetContent().getContent());
//            TbArtcle tbArtcle = dao.selectArticle();
//            BeanUtils.copyProperties(tbArtcle,tbArtcleDTO);
//            dtos.add(tbArtcleDTO);
//        }

        return dtos;
    }
}
