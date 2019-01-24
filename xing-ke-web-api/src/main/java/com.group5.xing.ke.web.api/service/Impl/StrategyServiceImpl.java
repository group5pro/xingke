package com.group5.xing.ke.web.api.service.Impl;

import com.group5.xing.ke.domain.TbStrategy;
import com.group5.xing.ke.web.api.DTO.PictureDTO;
import com.group5.xing.ke.web.api.DTO.TbStrategyDTO;
import com.group5.xing.ke.web.api.dao.StrategyDao;
import com.group5.xing.ke.web.api.service.StrategyService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StrategyServiceImpl implements StrategyService {
@Autowired
    StrategyDao dao;

    @Override
    public TbStrategy selectall() {
        return dao.selectall();
    }

    @Override
    public TbStrategy selectBySid(Long sid) {
        return dao.selectBySid(sid);
    }

    @Override
    public TbStrategyDTO selectStrategy(Long sid) {
        TbStrategyDTO tbStrategyDTO = new TbStrategyDTO();

        TbStrategyDTO strategyDTO = dao.selectStrategy(sid);
        BeanUtils.copyProperties(strategyDTO,tbStrategyDTO);

        List<PictureDTO> pictureDTO = dao.selectPicture(sid);
        tbStrategyDTO.setPic(pictureDTO);
        return tbStrategyDTO;
    }
}
