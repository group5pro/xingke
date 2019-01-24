package com.group5.xing.ke.web.api.service;

import com.group5.xing.ke.domain.TbStrategy;
import com.group5.xing.ke.web.api.DTO.TbStrategyDTO;

public interface StrategyService {

    TbStrategy selectall();

    TbStrategy selectBySid(Long sid);

    TbStrategyDTO selectStrategy(Long sid);
}
