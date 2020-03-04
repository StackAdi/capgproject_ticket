package com.capgemini.movie.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.capgemini.movie.model.Movie;
import com.capgemini.movie.model.Theatre;

public class AdminServices {

	Scanner sc = new Scanner(System.in) ;
	public Theatre addTheatre() 
	{
		Theatre the = new Theatre();
		
		System.out.println("-----Enter Theatre ID------");
		the.setTheaterId(sc.nextInt());
		sc.nextLine();
		
		System.out.println("-------Enter Theatre Name------");
		the.setTheaterName(sc.nextLine());
		
		System.out.println("-------Enter Theatre City------");
		the.setTheaterCity(sc.nextLine());
		
	
		System.out.println("-------Enter Manager Name------");
		the.setManagerName(sc.nextLine());
		
		System.out.println("-------Enter Manager Contact------");
		the.setManagerContact(sc.nextLine());
		
		System.out.println("How many movies you want to add:");
		int movieCount = sc.nextInt();
		
		for(int i=0;i<movieCount;i++)
		{
			Movie m = addMovie();
			HashMap<Integer, Movie> hsmov = the.getHsmovie();
			hsmov.put(m.getMovieId(), m);
			//System.out.println(hsmov);
			the.setHsmovie(hsmov);
		}
		
		   return the;
	 }
	
	public Movie addMovie() 
	{
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter Movie Details :  ");
	
		System.out.println("------Enter Movie ID ------");
		int movieId = sc.nextInt();
		sc.nextLine();
		
		System.out.println("------Enter Movie Name ------");
		String movieName = sc.nextLine() ;
	
		System.out.println("------Enter Movie Director ------");
		String movieDirector = sc.nextLine() ;	
	
		System.out.println("-------Enter Movie Length(in mins)------");
		int movieLength = sc.nextInt() ;
		sc.nextLine();
		
		System.out.println("------Enter Movie Release Date------");
		String movieReleaseDate = sc.nextLine();
		
		Movie m = new Movie(movieId, movieName, movieDirector, movieLength, movieReleaseDate);
		return m;
	}
	
	public void deleteTheatre(int tid) throws IOException 
	{
		// TODO Auto-generated method stub
		HashMap<Integer,Theatre> hs = TheatreService.getTheatrehs();
		   if(hs.containsKey(tid)) 
		   {
			   Theatre t = hs.get(tid);
			   hs.remove(tid,t) ;  
		   }
		  new TheatreService().storeFile(hs); 
	}
	
	public void viewTheatre() 
	{
		HashMap<Integer, Theatre> theatrehs = new TheatreService().getTheatrehs();
		for(Map.Entry m: theatrehs.entrySet())  
		{
			System.out.println(m.getKey() + "--" +  m.getValue());
		}		
	}
	

	public void updateMovie(int id) {

		Theatre the = new Theatre();
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Theatre> hm = new TheatreService().getTheatrehs();
		//System.out.println(hm);
		if(hm.containsKey(id))
		{
			
			  System.out.println("Enter Movie Details :  ");
			  
			  System.out.println("------Enter Movie ID ------"); int movieId =
			  sc.nextInt(); sc.nextLine();
			  
			  System.out.println("------Enter Movie Name ------"); String movieName =
			  sc.nextLine() ;
			  
			  System.out.println("------Enter Movie Director ------"); String movieDirector
			  = sc.nextLine() ;
			  
			  System.out.println("-------Enter Movie Length(in mins)------"); int
			  movieLength = sc.nextInt() ; sc.nextLine();
			  
			  System.out.println("------Enter Movie Release Date------"); String
			  movieReleaseDate = sc.nextLine();
			  
			  Movie m = new Movie(movieId, movieName, movieDirector, movieLength,
			  movieReleaseDate);
			 
			  
			 
			 HashMap<Integer, Theatre> hm1 = new TheatreService().getTheatrehs();
			for(Map.Entry<Integer, Theatre> z: hm1.entrySet())
			{
				Theatre th = z.getValue();
				HashMap<Integer, Movie> movie = th.getHsmovie();
				movie.put(m.getMovieId(), m);
				th.setHsmovie(movie);
				//System.out.println(hm1);
			}
		}
	}
	
		public void deleteMovie(int id) 
		{
			// TODO Auto-generated method stub
			HashMap<Integer, Theatre> hm = new TheatreService().getTheatrehs();
			if(hm.containsKey(id))
			{
				for(Map.Entry m : hm.entrySet()) 
				{
					Theatre th = (Theatre)m.getValue();
					HashMap<Integer, Movie> moviehash = th.getHsmovie();
					
					for(Map.Entry<Integer, Movie> mm : moviehash.entrySet())
					{
						System.out.println("Enter movie Id to delete: ");
						int movID = sc.nextInt();
						Movie movies = (Movie)mm.getValue();
						if(movies.getMovieId()== movID)
						{
							moviehash.remove(movID);
						}
						break;
					}
					break;
				}
				System.out.println("Deleted successfully!!");
			}
			
		}
	}
		
	

	