package com.applozic.service;

import com.applozic.request.MovieRequest;
import com.applozic.response.MovieResponse;

public interface MovieService {
	
   public MovieResponse getTotalAmountAndMovies(MovieRequest movieRequest);

}
