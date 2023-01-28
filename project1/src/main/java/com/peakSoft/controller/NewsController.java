package com.peakSoft.controller;

import com.peakSoft.model.News;
import com.peakSoft.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private NewsService newsService;

    @RequestMapping(value="/news/add")
    public ModelAndView addNewsPage() {
        ModelAndView modelAndView = new ModelAndView("add-news-form");
        modelAndView.addObject("news", new News());
        return modelAndView;
    }

    @RequestMapping(value="/news/add/process")
    public ModelAndView addingNews(@ModelAttribute News news) {

        ModelAndView modelAndView = new ModelAndView("index");
        newsService.addNews(news);

        String message = "News was successfully added.";
        modelAndView.addObject("message", message);

        return modelAndView;
    }




//    @RequestMapping(value="/news/list")
//    public ModelAndView listOfTeams() {
//        ModelAndView modelAndView = new ModelAndView("list-of-news");
//
//        List news = newsService.listNewses();
//        modelAndView.addObject("news", news);
//
//        return modelAndView;
//    }
}
