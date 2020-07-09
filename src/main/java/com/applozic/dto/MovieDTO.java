package com.applozic.dto;

import java.time.LocalDate;

public class MovieDTO {

	private String movieName;

	private LocalDate startDate;

	private LocalDate endDate;

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "MovieModel [movieName=" + movieName + ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}

}
