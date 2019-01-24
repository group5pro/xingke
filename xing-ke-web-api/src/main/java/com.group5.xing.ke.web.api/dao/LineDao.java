package com.group5.xing.ke.web.api.dao;

import com.group5.xing.ke.web.api.DTO.DescDTO;
import com.group5.xing.ke.web.api.DTO.LineDTO;
import com.group5.xing.ke.web.api.DTO.TbLine;
import org.springframework.stereotype.Repository;

@Repository
public interface LineDao {
    DescDTO selectByDesc(Long featureId);

    LineDTO select(Long sid);


    TbLine getTbLine(Long pid);
}
