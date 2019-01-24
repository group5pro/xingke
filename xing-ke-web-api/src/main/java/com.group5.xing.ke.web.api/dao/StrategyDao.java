package com.group5.xing.ke.web.api.dao;

import com.group5.xing.ke.domain.TbStrategy;
import com.group5.xing.ke.web.api.DTO.PictureDTO;
import com.group5.xing.ke.web.api.DTO.TbStrategyDTO;

import java.util.List;

public interface StrategyDao {
    //查询所有评论
    TbStrategy selectall();
    //查看单个攻略
    TbStrategy selectBySid(Long sid);

    List<PictureDTO> selectPicture(Long sid);

    TbStrategyDTO selectStrategy(Long sid);
}
