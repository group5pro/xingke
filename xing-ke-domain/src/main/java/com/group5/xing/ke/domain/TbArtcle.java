package com.group5.xing.ke.domain;

import lombok.Data;

import java.util.Date;

@Data
public class TbArtcle {
    private Long tid;
    private String title;
    private String desc;
    private String tpic;
    private Long ccount;
    private Date created;
}
