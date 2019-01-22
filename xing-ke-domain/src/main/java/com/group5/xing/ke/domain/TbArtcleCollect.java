package com.group5.xing.ke.domain;

import lombok.Data;

import java.util.Date;

@Data
public class TbArtcleCollect {
    private Long id;
    private Long tid;
    private Long collectorId;
    private Date collectDate;

}
