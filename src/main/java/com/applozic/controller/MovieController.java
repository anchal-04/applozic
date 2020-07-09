package com.applozic.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.applozic.api.MovieApi;
import com.applozic.dto.MovieDTO;
import com.applozic.request.MovieRequest;

import io.swagger.annotations.Api;


@RestController
@Api(tags = "Movies")
public class MovieController implements MovieApi {

	@Override
	public ResponseEntity<List<MovieDTO>> getTotalAmount(MovieRequest movieRequest) {
		// TODO Auto-generated method stub
		return null;
	}

}
