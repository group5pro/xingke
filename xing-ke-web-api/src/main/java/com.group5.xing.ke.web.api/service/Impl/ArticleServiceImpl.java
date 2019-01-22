package com.group5.xing.ke.web.api.service.Impl;

import com.group5.xing.ke.web.api.DTO.TbArtcleDTO;
import com.group5.xing.ke.web.api.dao.ArticleDao;
import com.group5.xing.ke.web.api.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    ArticleDao dao;

    @Override
    public List<TbArtcleDTO> select() {
        return dao.select();
    }
}
