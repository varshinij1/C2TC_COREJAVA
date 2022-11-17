package com.cg.abstractclass;

abstract class Movie {
	abstract void setTitle();
}
class Mymovie extends Movie {
	void setTitle() {
		System.out.println("Movie title is defeance");
	}

	public static void main(String[] args) {
		

	}

}
