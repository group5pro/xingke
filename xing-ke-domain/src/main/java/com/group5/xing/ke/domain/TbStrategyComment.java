package com.group5.xing.ke.domain;

import lombok.Data;

import java.util.Date;

@Data
public class TbStrategyComment {
    private Long id;
    private Long strategyId;
    private Long commentorId;
    private String content;
    private Date commentDate;
}
