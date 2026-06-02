package com.example.customnetflix.controller;

import com.example.customnetflix.service.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    private final MovieService movieService;

    public HelloController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("featured", movieService.getFeatured());
        model.addAttribute("contentRows", movieService.getContentRows());
        return "index";
    }

    @GetMapping("/api/health")
    @ResponseBody
    public String health() {
        return "Application is running!";
    }
}
