package com.fastcampus.projectboard.controller;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/articles")
@Controller
public class ArticleController {

    @GetMapping
    public String articles(ModelMap modelMap){
        modelMap.addAttribute("articles", List.of());

        return "articles/index";
    }

    @GetMapping("/{articleId}")
    public String article(@PathVariable Long articleId, ModelMap modelMap){
        modelMap.addAttribute("article", "article"); // TODO: 구현할 때 실제 데이터를 넣어줘야 한다.
        modelMap.addAttribute("articleComments", List.of());

        return "articles/detail";
    }
}
