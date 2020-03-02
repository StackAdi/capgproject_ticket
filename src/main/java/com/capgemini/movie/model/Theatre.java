package com.capgemini.movie.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Theatre implements Serializable 
{
	    int	theaterId;
		String theaterName;
		String theaterCity ; 
		String managerName;
		String managerContact ;
		String[] movie = new String[4] ;

		public String[] getMovie() {
			return movie;
		}
		public void setMovie(String[] m) {
			movie = m;
		}
		public int getTheaterId() {
			return theaterId;
		}
		public void setTheaterId(int theaterId) {
			this.theaterId = theaterId;
		}
		public String getTheaterName() {
			return theaterName;
		}
		public void setTheaterName(String theaterName) {
			this.theaterName = theaterName;
		}
		public String getTheaterCity() {
			return theaterCity;
		}
		public void setTheaterCity(String theaterCity) {
			this.theaterCity = theaterCity;
		}
		
		public String getManagerName() {
			return managerName;
		}
		public void setManagerName(String managerName) {
			this.managerName = managerName;
		}
		public String getManagerContact() {
			return managerContact;
		}
		public void setManagerContact(String managerContact) {
			this.managerContact = managerContact;
		}
		@Override
		public String toString() {
			return "Theatre [theaterId : " +theaterId + "\n" +" theaterName: " + theaterName +"\n" + " theaterCity: "  + theaterCity
					+"\n" + "Manager Name=" + managerName +"\n" + " Manager Contact: " + managerContact + "\n" +"Movie: "
					+ Arrays.toString(movie) + "]";
		}
		
		
		
		
		

}
