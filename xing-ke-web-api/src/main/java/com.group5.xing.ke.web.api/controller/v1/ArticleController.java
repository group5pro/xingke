package com.group5.xing.ke.web.api.controller.v1;

import com.group5.xing.ke.web.api.DTO.TbArtcleDTO;
import com.group5.xing.ke.web.api.service.ArticleService;
import com.group5.xing.ke.web.api.utils.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "${api.path.v1}/article")
public class ArticleController {
    @Autowired
    ArticleService service;


    @RequestMapping(value = "content", method = RequestMethod.GET)
    public BaseResult article() {
        List<TbArtcleDTO> tbArtcleDTOS = service.select();
        if(tbArtcleDTOS!=null){
            BaseResult baseResult = BaseResult.success("文章信息获取成功", tbArtcleDTOS);
            return baseResult;
        }else {
            BaseResult baseResult = BaseResult.fail("文章信息获取失败");
            return baseResult;
        }

    }

}
