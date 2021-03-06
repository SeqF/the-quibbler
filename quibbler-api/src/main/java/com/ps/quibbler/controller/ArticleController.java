package com.ps.quibbler.controller;

import com.ps.quibbler.global.Result;
import com.ps.quibbler.pojo.dto.PageParams;
import com.ps.quibbler.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ps
 */
@RestController
@RequestMapping("articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @PostMapping
    public Result listArticle(@RequestBody PageParams pageParams) {
        return Result.successWithData(articleService.getArticlePageList(pageParams));
    }

    @PostMapping("/hot")
    public Result getHotArticles() {
        int limit = 5;
        return Result.successWithData(articleService.getHotArticles(limit));
    }

    @PostMapping("/new")
    public Result getNewArticles() {
        int limit = 5;
        return Result.successWithData(articleService.getNewArticles(limit));
    }
}
