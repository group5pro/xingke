package com.group5.xing.ke.web.api.DTO;

import lombok.Data;

import java.util.Date;

@Data
public class TbArtcleDTO {
    //用户ID
    private Long id ;
    //标题ID
    private Long tid;
    private String desc;
    private String title;
    private String tpic;
    private Long ccount;
    private Date created;
    private String content;


}
