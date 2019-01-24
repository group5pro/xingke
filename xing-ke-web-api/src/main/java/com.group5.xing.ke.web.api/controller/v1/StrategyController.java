package com.group5.xing.ke.web.api.controller.v1;

import com.group5.xing.ke.domain.TbStrategy;
import com.group5.xing.ke.web.api.DTO.TbStrategyDTO;
import com.group5.xing.ke.web.api.service.StrategyService;
import com.group5.xing.ke.web.api.utils.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "${api.path.v1}/strategys")
public class StrategyController {
@Autowired
    StrategyService service;

    @RequestMapping(value = "list",method = RequestMethod.GET)
    public BaseResult list(){
        TbStrategy tbStrategy = service.selectall();
        BaseResult baseResult = BaseResult.success("攻略获取成功", tbStrategy);
        return baseResult;
    }

    @RequestMapping(value = "sid/{sid}",method = RequestMethod.GET)
    public BaseResult strategyId(@PathVariable Long sid){
        TbStrategyDTO tbStrategy = service.selectStrategy(sid);
        BaseResult baseResult = BaseResult.success("攻略获取成功", tbStrategy);
        return baseResult;
    }


}
