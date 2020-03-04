package com.capgemini.movie.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.capgemini.movie.model.Theatre;
import com.capgemini.movie.model.User;

public class ForgetPassword {

	public void forgetPassword() throws IOException, ClassNotFoundException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the User Id: ");
		int id = sc.nextInt();
		File f = new File("C:\\CapGemini\\Project\\TickIt\\src\\main\\resources\\User.txt");
		FileInputStream fis = null;
		FileOutputStream fos = null;
		HashMap<Integer, User> object1 = null;
		
		
		fis = new FileInputStream(f);
		ObjectInputStream in = new ObjectInputStream(fis);
		object1 = (HashMap<Integer, User>) in.readObject();
		
			if(object1.containsKey(id))
			{
				for(Map.Entry m:object1.entrySet()) 
				{
				    User u = (User) m.getValue();
					sc.nextLine();
					//int userId = u.getUserId();
			    	System.out.println("Enter the password: "); 
					String password = sc.nextLine();
					u.setUserId(id);
					u.setPassword(password);
					object1.put(id,u);
				   break;
				}
			}
			
			in.close();
			fis.close();
			fos = new FileOutputStream(f);
			ObjectOutputStream out = new ObjectOutputStream(fos);
			
			out.writeObject(object1);
			
			out.close();
			fos.close();
			System.out.println("Updated Successfully !!");
			System.out.println("-------------------------------------");
			
			
			//new UserService().signIn();
		
	}
}
