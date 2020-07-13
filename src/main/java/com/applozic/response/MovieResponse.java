package com.applozic.response;

import java.util.List;

import com.applozic.model.MovieModel;

public class MovieResponse {

	private List<MovieModel> movies;

	private long totalAmount;

	public List<MovieModel> getMovies() {
		return movies;
	}

	public void setMovies(List<MovieModel> movies) {
		this.movies = movies;
	}

	public long getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(long totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "MovieResponse [movies=" + movies + ", totalAmount=" + totalAmount + "]";
	}

}
