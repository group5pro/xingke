package com.group5.xing.ke.web.api.service;

import com.group5.xing.ke.web.api.DTO.LineDTO;
import com.group5.xing.ke.web.api.DTO.TbProduct;

import java.util.List;


public interface LineService {
    LineDTO selectDesc(Long pid);

    List<TbProduct> selectProduct();
}
