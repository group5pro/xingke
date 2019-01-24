package com.group5.xing.ke.web.api.controller.v1;

import com.group5.xing.ke.web.api.DTO.LineDTO;
import com.group5.xing.ke.web.api.DTO.TbProduct;
import com.group5.xing.ke.web.api.service.LineService;
import com.group5.xing.ke.web.api.utils.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("${api.path.v1}/lines")
public class LineController {
    @Autowired
    LineService service;


    @RequestMapping(value = "/pid/{pid}",method = RequestMethod.GET)
    public BaseResult line(@PathVariable Long pid){
        LineDTO lineDTO = service.selectDesc(pid);
        BaseResult baseResult = BaseResult.success("线路获取成功",lineDTO);
        return baseResult;
    }

    @RequestMapping(value = "city",method = RequestMethod.GET)
    public BaseResult line(){
        List<TbProduct> tbProduct = service.selectProduct();
        BaseResult baseResult = BaseResult.success("获取成功",tbProduct);
        return baseResult;
    }

}
