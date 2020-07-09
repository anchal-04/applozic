package com.applozic.response;

import java.util.List;

import com.applozic.dto.MovieDTO;

public class MovieResponse {

	private List<MovieDTO> movieDTOs;

	private int totalAmount;

	public List<MovieDTO> getMovieDTOs() {
		return movieDTOs;
	}

	public void setMovieDTOs(List<MovieDTO> movieDTOs) {
		this.movieDTOs = movieDTOs;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "MovieResponse [movieDTOs=" + movieDTOs + ", totalAmount=" + totalAmount + "]";
	}

}
