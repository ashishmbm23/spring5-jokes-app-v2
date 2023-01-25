package com.example.chucknorrisjokes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class ChuckNorrisJokesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChuckNorrisJokesApplication.class, args);
	}

}
