package com.group5.xing.ke.domain;

import lombok.Data;

@Data
public class TbStrategy {

    private Long id;      //用户id
    private Long sid;       //攻略id
    private String author; //作者
    private String line;
    private String splay;
    private String playpic;
    private String sfood;
    private String foodpic;
    private String saccommodation;  //住宿攻略
    private Long ccount;   //点赞
    private String traffic;   //交通攻略
    private String content;  //评论
}
