package com.capgemini.movie.controller;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

import com.capgemini.movie.model.User;
import com.capgemini.movie.ui.MovieController;

public class UserService 
{
	
	Scanner sc = new Scanner(System.in);
	
	public void choice() throws ClassNotFoundException, IOException 
	{
		// TODO Auto-generated method stub
		System.out.println("1. For Existing user");
		System.out.println("2. For New user");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			signIn();
			break;
		case 2:
			registerNewUser();
			break;
		default:
			System.out.println("Wrong Input !!");
		}
	
	}
	
	public static void registerNewUser() 
	{
		Scanner sc = new Scanner(System.in);
		//sc.nextLine();
	    System.out.println("Enter the userId: "); 
	    int userId = sc.nextInt();
	    sc.nextLine();
	    
		System.out.println("Enter the password: "); 
		String password = sc.nextLine();
	
		User u = new User(userId, password);
		
		
		  File f = new File("C:\\CapGemini\\Project\\TickIt\\src\\main\\resources\\User.txt");
		  FileInputStream fis=null;
		  ObjectInputStream ois=null;
		  HashMap<Integer, User> hm=null;
		try {
				fis = new FileInputStream(f);
			 	ois = new ObjectInputStream(fis); 
			  hm = new HashMap<Integer, User>();
			  hm = (HashMap<Integer, User>) ois.readObject();
			  
			  if(hm.containsKey(userId)) 
			  {
			  System.out.println("UserId already exists !! -_- ");
			  UserService.registerNewUser(); 
			  }
			  
			  ois.close(); 
			  fis.close(); 
			  hm.put(userId, u);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File does not exist");
		} 
		catch(IOException io) {
			System.out.println("file is empty");
		}
		catch(ClassNotFoundException io) {
			System.out.println("object is not present");
		}
		
		
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(hm);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(IOException io) {
			System.out.println("file is empty");
		}
		
	
		System.out.println("Added successfully !!");
		try {
			new MovieController().movieMain();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void signIn() throws IOException, ClassNotFoundException
	{
		Scanner sc = new Scanner(System.in);
		File f = new File("C:\\CapGemini\\Project\\TickIt\\src\\main\\resources\\User.txt");
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		HashMap<Integer, User> hm;
		hm = (HashMap<Integer, User>) ois.readObject();
		
		System.out.println("Enter the userId: "); 
	    int userId = sc.nextInt();
	    
	    if(hm.containsKey(userId))
	    {
	    	sc.nextLine();
	    	System.out.println("Enter the password: "); 
			String password = sc.nextLine();
			
			if(hm.get(userId).getPassword().equals(password))
			{
				System.out.println("Login Successfully");
			    System.out.println("--------------------------------");
		   		System.out.println("          Movies List           ");
		   		System.out.println("--------------------------------");
				//AdminServices.viewMovies() ;
		   		BookingServices.bookMovie();
			}
			else
			{
				System.out.println("Wrong Password");
			    new MovieController().movieMain();
			}
	    }
	    
	    else
	    { 
	    	System.out.println("User doesn't exist !! -_- ");
	    }
	}

	
}  //main class close
