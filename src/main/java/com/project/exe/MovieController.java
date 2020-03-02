package com.project.exe;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.project.dto.Theatre;
import com.project.services.AdminServices;
import com.project.services.ForgetPassword;
import com.project.services.Storage;
import com.project.services.UserService;

public class MovieController {

	public static void main(String[] args) throws ClassNotFoundException, IOException 
	{
		try 
		  { 
			 try {
				Storage.extractFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		  } 
		  catch (ClassNotFoundException e1)
		  {
		  e1.printStackTrace(); 
		  }
		MovieController MC = new MovieController();
		MC.movieMain();
		
//		  HashMap<Integer, Theatre> th=new HashMap<Integer, Theatre>();
//		  File f = new File("C:\\CapGemini\\Project\\TickIt\\src\\main\\resources\\MovieData.txt") ;
//		  FileOutputStream fos = new FileOutputStream(f) ; ObjectOutputStream oos = new
//		  ObjectOutputStream(fos) ; oos.writeObject(th); oos.close(); fos.close();
//		 
	
	}
	public void movieMain() throws ClassNotFoundException, IOException {
		Scanner sc = new Scanner(System.in);
		try
		{
		System.out.println("----------------------------------------------------------------");
		System.out.println("                    Welcome to TickIt                           ");
		System.out.println("----------------------------------------------------------------");
		System.out.println("1. User Login");
		System.out.println("2. Admin Login");
		System.out.println("3. Forget Password");
		System.out.println("4. Exit");
		System.out.println("----------------------------------------------------------------");
		System.out.println("Enter your choice: ");
		int choice = sc.nextInt();
		
		switch(choice)
		{
			case 1:
				new UserService().choice();
				break;
			case 2:
				MainClass.login();
				break;
			case 3:
				//ForgetPassword.forgetPassword(sc);
			case 4:
				System.exit(0);
		}
	}
		catch(InputMismatchException e)
		{
			System.out.println("Wrong Input!!");
		}
	}
}
