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
import com.capgemini.movie.model.Theatre;

public class MainClass {
		
public static void login() 
{
		  
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome Admin . Enter Password to confirm :"); 
	String str1 = sc.nextLine() ;
		  
	if(str1.equals("password")) 
	{
		System.out.println("Verified !!!");
		Admin adm = new Admin("CS16086", "Vaibhav Saxena", "password", "25-01-1998","9876542") ; 
		AdminServices ads = new AdminServices() ;
		
		System.out.println("---------------------------------------------");
		System.out.println("WHAT DO YOU WANT TO DO :");
		System.out.println();
        System.out.println(" 1.Add Theatre"); 
		System.out.println(" 2.View Movies");
		System.out.println(" 3.Update Movie");
		System.out.println(" 4.Delete Theatre"); 
		System.out.println("---------------------------------------------");
		String str = sc.nextLine();
		  
		if(str.charAt(0)=='1') 
		{
		     System.out.println("Enter no. of theatres you want to add : "); 
		     int tn=	sc.nextInt() ; 
		     for (int i = 1; i <= tn; i++) 
		     {
		      	Theatre t = ads.addTheatre() ;
		        Storage.addTheatre(t);
		        System.out.println("--------------------------------------------");
		      }
		 } 
		        
		 else if(str.charAt(0)=='2') 
		 {
			System.out.println("--------------------------------");
	   		System.out.println("          Movies List           ");
	   		System.out.println("--------------------------------");
			AdminServices.viewMovies();
	     }
		        
		 else if(str.charAt(0)=='3') 
		 {
		     System.out.println("Enter Theatre ID :");
		     int id = sc.nextInt() ;
		     ads.updateMovie(id);
		     System.out.println("Movie Added succesfully : ");
		        	
		 }
		
		 else if(str.charAt(0)=='4') 
		 {
		    System.out.println("Enter Theatre ID :");
		    int id = sc.nextInt() ;
		    ads.deleteMovie(id);
		    System.out.println("Deleted succesfuly...");
		 }
		
	}
	else 
	{
		System.out.println("Wrong Password....");
		System.out.println("Restart Your Application...");
	}
	
	
		  try {
			Storage.storeFile(Storage.getTheatrehs());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
		
}

