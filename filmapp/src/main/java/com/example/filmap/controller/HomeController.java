package com.example.filmap.controller;

import com.example.filmap.service.MovieServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @Autowired
    MovieServiceImp movieService;

    @GetMapping("/")
    public String getHome(Model model){
        model.addAttribute("movies",movieService.findAll());
        return "home";
    }
    @RequestMapping("/find")
    public String homeSearch(Model model, @RequestParam(value = "title")String title){
        model.addAttribute("movies",movieService.searchByTitle(title));
        return "home";
    }
    @RequestMapping("/findActor")
    public String homeFindActor(Model model, @RequestParam(value = "actor")String actor){
        model.addAttribute("movies",movieService.searchByActor(actor));
        return "home";
    }
}
