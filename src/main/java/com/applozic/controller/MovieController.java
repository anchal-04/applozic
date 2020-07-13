package com.applozic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.applozic.request.MovieRequest;
import com.applozic.response.MovieResponse;
import com.applozic.service.MovieService;

@RestController
public class MovieController {

	@Autowired
	private MovieService movieService;
	
	@PostMapping("/movies")
	public MovieResponse getTotalAmount(@RequestBody MovieRequest movieRequest) {
		return movieService.getTotalAmountAndMovies(movieRequest);
	}

}
