package com.applozic.service;

import com.applozic.request.MovieRequest;
import com.applozic.response.MovieResponse;

/**
 * @author Anchal
 *
 */
public interface MovieService {
	
   public MovieResponse getTotalAmountAndMovies(MovieRequest movieRequest);

}
