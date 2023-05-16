package com.multi.mvc200;

public class MovieVO {
	private String movie;
	private int price;
	
	public String getMovie() {
		return movie;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "MovieVO [movie=" + movie + ", price=" + price + "]";
	}
}
