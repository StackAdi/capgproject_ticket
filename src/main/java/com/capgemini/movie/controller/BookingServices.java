package com.capgemini.movie.controller;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.capgemini.movie.model.Theatre;

public class BookingServices {

	public static void bookMovie() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		HashMap<Integer,Theatre> hs = Storage.getTheatrehs();
        for(Theatre t : hs.values()) 
        {
       	 String[] str= t.getMovie() ;
       	 	for(int i = 0 ; i<1 ; i++) 
       	 	{
       	 		System.out.print("> "+str[i]);
       	 		System.out.println();
       	 	}
        }
       	 System.out.println("Choose Movie........");
       	 try 
       	 {
       	 String book = sc.nextLine();
       	 
       	 
       	 
       	 
       	 }
       	 catch(InputMismatchException e)
       	 {
       		 System.out.println("Movie Does not Exist!!");
       	 }
       	 
	}
}

