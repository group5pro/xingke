package com.group5.xing.ke.web.api.DTO;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class LineDTO {


    private Long pid;
    private String pic;
    private String firstCity;
    private List<DescDTO> day;
    private BigDecimal price;
    private String feature;
    private String categoryname;
    private String title;
    private Long person;
    private Date deptime;
    private Date backtime;
}
