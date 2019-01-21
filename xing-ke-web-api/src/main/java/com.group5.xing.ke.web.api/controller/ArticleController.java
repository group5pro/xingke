package com.group5.xing.ke.web.api.controller;

import com.group5.xing.ke.web.api.utils.BaseResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "${api.path.v1}/article")
public class ArticleController {

    @RequestMapping("content")
    public BaseResult article(){
        BaseResult baseResult = null;
        return baseResult;
    }

}
