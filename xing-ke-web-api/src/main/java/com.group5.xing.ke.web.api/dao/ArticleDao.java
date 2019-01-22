package com.group5.xing.ke.web.api.dao;

import com.group5.xing.ke.domain.TbArtcle;
import com.group5.xing.ke.domain.TbArtcleCollect;
import com.group5.xing.ke.domain.TbStrategyComment;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleDao {
    List<TbArtcle> select();

    TbArtcleCollect selectGetId();

    TbStrategyComment selectGetContent();

    TbArtcle selectArticle();
}
