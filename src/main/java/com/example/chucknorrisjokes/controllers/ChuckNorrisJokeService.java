package com.example.chucknorrisjokes.controllers;

import com.example.chucknorrisjokes.services.JokeService;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuckNorrisJokeService implements JokeService {

    ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisJokeService(){
        chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    @RequestMapping("/")
    public String generateJoke(Model model) {
        String randomJoke = chuckNorrisQuotes.getRandomQuote();
        model.addAttribute("joke", randomJoke);
        return "index";
    }
}
