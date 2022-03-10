package com.ibm.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.entity.Movie;
import com.ibm.entity.Multiplex;
import com.ibm.repo.MovieRepository;

public class TestMovieMul {
	private static MovieRepository repo;

	@BeforeAll
	public static void init() {
		repo = new MovieRepository();
	}
	@Test
	public void testSaveMovie() 
	{
		Movie m = new Movie();
		m.setMovId(1);
		m.setTitle("raze");
		repo.addMovie(m);
	}
	public void testSaveMultiplex() {
		Multiplex m1= new Multiplex();
		m1.setName("rangoli");
		repo.addMultiplex(m1);
	}
	
}
