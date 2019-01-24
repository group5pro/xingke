package com.group5.xing.ke.web.api.DTO;

import lombok.Data;

import java.util.List;

@Data
public class TbStrategyDTO {

//    private Long id;      //用户id
    private Long sid;       //攻略id
    private String title;
    private String author; //作者
    private String line;
    private String splay;
    private String sfood;
    private List<PictureDTO> pic;
    private String saccommodation;  //住宿攻略
    private Long ccount;   //点赞
    private String traffic;   //交通攻略
    private String content;  //评论
}
