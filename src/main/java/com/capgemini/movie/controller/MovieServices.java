package com.capgemini.movie.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Scanner;

import com.capgemini.movie.model.Movie;
import com.capgemini.movie.model.Theatre;

public class MovieServices {

	static HashMap<Integer, Movie> moviehs = new HashMap<Integer,Movie>();
	
	public static void storeMovie(HashMap<Integer, Movie> moviehs) throws IOException 
	{
		File f = new File("C:\\CapGemini\\Project\\TickIt\\src\\main\\resources\\FileMovie.txt") ;
		FileOutputStream fos = new FileOutputStream(f) ;
		ObjectOutputStream oos = new ObjectOutputStream(fos) ;	
		oos.writeObject(moviehs);
		oos.close();
		fos.close();
	}
	
	public static void extractMovieFile() throws IOException, ClassNotFoundException 
	{
		
		File f = new File("C:\\CapGemini\\Project\\TickIt\\src\\main\\resources\\FileMovie.txt") ;
		FileInputStream fis = new FileInputStream(f) ;
		ObjectInputStream ois = new ObjectInputStream(fis) ;	
		
		moviehs = (HashMap<Integer, Movie>)ois.readObject() ;
		
		ois.close();
		fis.close();
	}
	
	public static void setMovies(HashMap<Integer, Movie> moviehs) 
	{
		MovieServices.moviehs = moviehs;
	}

	static public void addMovie(Movie m) 
	{
		System.out.println("nkjasgfiuadf");   //trial
		moviehs.put(m.getMovieId(), m);
	}	
		 
	static public HashMap<Integer, Movie> getMovies() {
		return moviehs;
	}
}
