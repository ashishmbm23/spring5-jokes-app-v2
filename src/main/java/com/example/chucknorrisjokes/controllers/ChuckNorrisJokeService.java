package com.example.chucknorrisjokes.controllers;

import com.example.chucknorrisjokes.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuckNorrisJokeService{

    private final JokeService jokeService;

    public ChuckNorrisJokeService(JokeService jokeService){
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    public String generateJoke(Model model) {
        String randomJoke = jokeService.generateJoke();
        model.addAttribute("joke", randomJoke);
        return "index";
    }
}
