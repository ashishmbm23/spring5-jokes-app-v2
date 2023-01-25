package com.example.chucknorrisjokes.services;

import org.springframework.ui.Model;

public interface JokeService {

    String generateJoke(Model model);
}
