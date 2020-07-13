package com.applozic.request;

import java.util.List;

import com.applozic.model.MovieModel;

public class MovieRequest {

	private List<MovieModel> movieList;

	public List<MovieModel> getMovieList() {
		return movieList;
	}

	public void setMovieList(List<MovieModel> movieList) {
		this.movieList = movieList;
	}

	@Override
	public String toString() {
		return "MovieRequest [movieList=" + movieList + "]";
	}

}
