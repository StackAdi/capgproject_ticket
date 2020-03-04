package com.capgemini.movie.ui;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.capgemini.movie.controller.*;
import com.capgemini.movie.model.Admin;
import com.capgemini.movie.model.Movie;
import com.capgemini.movie.model.Theatre;

public class MainClass {
		
public static void login() throws IOException 
{
		  
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome Admin . Enter Password to confirm :"); 
	String str1 = sc.nextLine() ;
		  
	if(str1.equals("password")) 
	{
		System.out.println("Verified !!!");
		Admin adm = new Admin("CS16086", "Vaibhav Saxena", "password") ; 
		AdminServices ads = new AdminServices();
		
		System.out.println("---------------------------------------------");
		System.out.println("WHAT DO YOU WANT TO DO :");
		System.out.println();
        System.out.println(" 1. Add Theatre"); 
		System.out.println(" 2. Delete Theatre");
		System.out.println(" 3. View Theatre");
		System.out.println(" 4. Update Movie");
		System.out.println(" 5. Delete Movie"); 
		System.out.println("---------------------------------------------");
		String str = sc.nextLine();
		  
		switch(str)
		{
		   
		case "1":
		   System.out.println("Enter no. of theatres you want to add : "); 
		   int tn=	sc.nextInt() ; 
		   for (int i = 1; i <= tn; i++) 
		   {
		      //Theatre t = ads.addTheatre() ;
			  Theatre t = ads.addTheatre(); 
		      TheatreService.addTheatre(t);
		      System.out.println("--------------------------------------------");
		   }
		   break;
		
		        
		case"2":
		{
			System.out.println("Enter Theatre Id to delete: ");
			int tid = sc.nextInt();
			//ads.deleteTheatre(tid);
			ads.deleteTheatre(tid);
			System.out.println("Deleted successfully!! ");
			break;
		}
		
		case "3":
		{
			ads.viewTheatre();
			break;
		}
		        
		case "4":
	    { 
	    	System.out.println("Enter Theatre ID :"); 
	    	int id = sc.nextInt() ; 
	    	ads.updateMovie(id);
			System.out.println("Movie updated succesfully : ");
			break;
	    }
			 
		case "5":
	    {
	    	System.out.println("Enter Theatre ID : ");
	    	int id = sc.nextInt();
	    	ads.deleteMovie(id);
	    	break;
	    }
     }	
	
	}	
else 
	{
		System.out.println("Wrong Password....");
		System.out.println("Restart Your Application...");
	}
	
	
		  try {
			TheatreService.storeFile(TheatreService.getTheatrehs());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
		
}

