package com.peakSoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @RequestMapping(value="/")
    public ModelAndView mainPage() {
        return new ModelAndView("index");
    }

    @RequestMapping(value="/index")
    public ModelAndView indexPage() {
        return new ModelAndView("index");
    }


//    @Autowired
//    private NewsService newsService;
//
//    @GetMapping("/")
//    public String mainPage(Model model) {
//        model.addAttribute("message", "Welcome");
//        return "index";
//    }
}
