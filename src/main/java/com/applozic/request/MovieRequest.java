package com.applozic.request;

import java.util.List;

import com.applozic.dto.MovieDTO;

public class MovieRequest {

	private List<MovieDTO> movieDTOs;

	public List<MovieDTO> getMovieDTOs() {
		return movieDTOs;
	}

	public void setMovieDTOs(List<MovieDTO> movieDTOs) {
		this.movieDTOs = movieDTOs;
	}

	@Override
	public String toString() {
		return "MovieRequest [movieDTOs=" + movieDTOs + "]";
	}

}
