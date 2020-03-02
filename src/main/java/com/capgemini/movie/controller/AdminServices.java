package com.capgemini.movie.controller;
import java.util.*;

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
		
		
		  System.out.println("Enter Movie Details :  "); 
		  String str[] = new String[4] ;
		  
		  
		  System.out.println("------Enter Movie Name ------"); 
		  str[0]=sc.nextLine() ;
		  
		  System.out.println("------Enter Movie Director ------"); 
		  str[1]=sc.nextLine() ;
		  
		  System.out.println("-------Enter Movie Length(in mins)------");
		  str[2]=sc.nextLine() ;
		  
		  //System.out.print("  minutes");
		  
		  System.out.println("------Enter Movie Release Date------");
		  str[3]=sc.nextLine() ; the.setMovie(str);
		 
	     
		   return the;
	 }
	
	  public static void viewMovies() 
	   {
		
		   HashMap<Integer,Theatre> hs = Storage.getTheatrehs();
		         for(Theatre t : hs.values()) 
		         {
		        	 String[] str= t.getMovie() ;
		        	 	for(int i = 0 ; i<1 ; i++) 
		        	 	{
		        	 		System.out.print("> "+str[i]);
		        	 	}
		        	 	System.out.println();
			            //BookingServices.bookMovie();
		        	 	
		        	//System.out.println("---------------------------------------");
		         }
		} 
	   
	   public void updateMovie(int tid) 
	   {
		   HashMap<Integer,Theatre> hs = Storage.getTheatrehs();
		   if(hs.containsKey(tid)) {
			   Theatre t = hs.get(tid);
			   System.out.println("Enter Movie Details :  ");
		       String str[] = new String[4] ;
				   
		    	System.out.println("------Enter Movie Name ------");
				  str[0]=sc.nextLine() ;
				  
				System.out.println("------Enter Movie Director ------");
				   str[1]=sc.nextLine() ;
				   
				System.out.println("-------Enter Movie Length(in mins)------");
				   str[2]=sc.nextLine() ;
				   
				     
				System.out.println("------Enter Movie Release Date------");
				   str[3]=sc.nextLine() ;
				   t.setMovie(str);
				   
				   hs.put(tid, t);
				   
				  Storage.setTheatrehs(hs);
			   
		   }
	   }
	   
	   public void deleteMovie(int tid) 
	   {
		   HashMap<Integer,Theatre> hs = Storage.getTheatrehs();
		   if(hs.containsKey(tid)) {
			   Theatre t = hs.get(tid);
			   hs.remove(tid,t) ;   
		  }
	   }
	

}
