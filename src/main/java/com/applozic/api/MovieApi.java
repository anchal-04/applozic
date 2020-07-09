package com.applozic.api;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.applozic.dto.MovieDTO;
import com.applozic.error.ApplozicError;
import com.applozic.request.MovieRequest;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RequestMapping("movies")
public interface MovieApi {
	@ApiOperation(value = "Fetch the details of the movie and the total amount", nickname = "getTotalAmount", notes = "Returns the movie details and amount data", response = MovieDTO.class, tags = "Movies")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Details of the movie and the total amount data fetched successfully", response = MovieDTO.class),
			@ApiResponse(code = 500, message = "Could not get data", response = ApplozicError.class)})
	@PostMapping(produces = { "application/json" })
	ResponseEntity<List<MovieDTO>> getTotalAmount(@RequestBody MovieRequest movieRequest);

}







