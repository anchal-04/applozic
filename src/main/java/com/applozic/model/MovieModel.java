package com.applozic.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class MovieModel {

	private String movieName;
	@JsonFormat(pattern="dd-MM-yyyy")
	private LocalDate startDate;
	@JsonFormat(pattern="dd-MM-yyyy")
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
