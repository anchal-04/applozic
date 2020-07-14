package com.applozic.service.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.applozic.model.MovieModel;
import com.applozic.request.MovieRequest;
import com.applozic.response.MovieResponse;
import com.applozic.service.MovieService;

/**
 * @author Anchal
 *
 */
@Service
public class MovieServiceImpl implements MovieService {

	@Override
	public MovieResponse getTotalAmountAndMovies(MovieRequest movieRequest) {
		if (movieRequest.getMovieList().isEmpty()) {
			return null;
		}

		List<MovieModel> movieList = movieRequest.getMovieList();
		MovieResponse response = new MovieResponse();
		List<MovieModel> movieModels = new ArrayList<>();
		Collections.sort(movieList, (m1, m2) -> m1.getEndDate().compareTo(m2.getEndDate()));
		movieModels.add(movieList.get(0));
		LocalDate endDate = movieList.get(0).getEndDate();
		for (int i = 1; i < movieList.size(); i++) {
			LocalDate currentStartDate = movieList.get(i).getStartDate();
			LocalDate currentEndDate = movieList.get(i).getEndDate();
			if (currentStartDate.isAfter(endDate)) {
				movieModels.add(movieList.get(i));
				endDate = currentEndDate;
			}
		}
		response.setMovies(movieModels);
		response.setTotalAmount(movieModels.size() * 10000000l);
		return response;

	}

}
