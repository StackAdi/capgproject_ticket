package com.capgemini.movie.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import com.capgemini.movie.model.Theatre;

public class TheatreService  
{

	static HashMap<Integer, Theatre> theatrehs = new HashMap<Integer,Theatre>();
	
	public static void storeFile(HashMap<Integer, Theatre> theatrehs) throws IOException 
	{
		File f = new File("C:\\CapGemini\\Project\\TickIt\\src\\main\\resources\\MovieData.txt") ;
		FileOutputStream fos = new FileOutputStream(f) ;
		ObjectOutputStream oos = new ObjectOutputStream(fos) ;	
		oos.writeObject(theatrehs);
		oos.close();
		fos.close();
	}
	
	public static void extractFile() throws IOException, ClassNotFoundException 
	{
		
		File f = new File("C:\\CapGemini\\Project\\TickIt\\src\\main\\resources\\MovieData.txt") ;
		FileInputStream fis = new FileInputStream(f) ;
		ObjectInputStream ois = new ObjectInputStream(fis) ;	
		
		theatrehs = (HashMap<Integer, Theatre>)ois.readObject() ;
		
		ois.close();
		fis.close();
	}
	
	public static void setTheatrehs(HashMap<Integer, Theatre> theatrehs) 
	{
		TheatreService.theatrehs = theatrehs;
	}

	static public void addTheatre(Theatre t) 
	{
		//System.out.println(theatrehs);
		theatrehs.put(t.getTheaterId(), t);
	}	
		 
	 public static HashMap<Integer, Theatre> getTheatrehs() {
		return theatrehs;
	}
	
}
