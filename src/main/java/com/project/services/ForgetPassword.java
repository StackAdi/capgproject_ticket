package com.project.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.project.dto.User;
import com.project.exe.MovieController;

public class ForgetPassword {

	public static void forgetPassword()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the userId: ");
		int userId = sc.nextInt();
		User valid = null;
		
		File f = new File("C:\\CapGemini\\Project\\TickIt\\src\\main\\resources\\User.txt");
		FileInputStream fis = null;
		HashMap<Integer, User> hm = null;
		ObjectInputStream ois = null;
		
		fis = new FileInputStream(f);
		ois = new ObjectInputStream(fis);
		hm = (HashMap<Integer, User>) ois.readObject();
		
		for(Map.Entry mapElement : object1.entrySet())
		{
			User u = (User)mapElement.getValue();
		if(u.getUserId() == userId)
		{
			valid = u;
			break;
		}
		}
		
		System.out.println("Enter the password: "); 
		String password = sc.nextLine();
		valid.setPassword(password);
		object1.put(valid.getUserId(), valid)
		
		fis.close();
		new MovieController().movieMain().movieMain();
		
		
	}
}
