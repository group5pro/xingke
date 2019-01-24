package com.group5.xing.ke.web.api.DTO;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class TbProduct {
    private Long pid;
    private String title;
    private String pic;
    private String city;
    private String categoryName;
    private BigDecimal price;
}
