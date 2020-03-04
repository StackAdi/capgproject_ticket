package com.capgemini.movie.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

import com.capgemini.movie.model.Movie;
import com.capgemini.movie.model.Theatre;

public class BookingServices {

	public static void bookMovie() throws IOException, ClassNotFoundException 
	{
		// TODO Auto-generated method stub
		
		File f = new File("C:\\CapGemini\\Project\\TickIt\\src\\main\\resources\\MovieData.txt") ;
		FileInputStream fin = new FileInputStream(f);
		ObjectInputStream in = new ObjectInputStream(fin);
		HashMap<Integer, Theatre> moviehs =  (HashMap<Integer,Theatre>)in.readObject();
		
		for(Map.Entry m:moviehs.entrySet()) 
		{
			Theatre th = (Theatre)m.getValue();
			System.out.println("Theatre Name:-"+th.getTheaterName());
			HashMap<Integer, Movie> movie = th.getHsmovie();
			int i=0;
			for(Map.Entry<Integer, Movie> mm:movie.entrySet())
			{
				Movie movies = (Movie)mm.getValue();
				System.out.println(++i+". "+movies.getMovieName());
			}
			
		}
		in.close();
		fin.close();
	}
}

