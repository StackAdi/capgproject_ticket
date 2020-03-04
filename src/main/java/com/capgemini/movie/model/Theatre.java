package com.capgemini.movie.model;

import java.io.Serializable;
import java.util.ArrayList;
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
		//String[] movie = new String[4] ;
	    HashMap<Integer, Movie> hsmovie = new HashMap<>();
	    
	public Theatre(int theaterId, String theaterName, String theaterCity, String managerName, String managerContact,
				HashMap<Integer, Movie> hsmovie) {
			super();
			this.theaterId = theaterId;
			this.theaterName = theaterName;
			this.theaterCity = theaterCity;
			this.managerName = managerName;
			this.managerContact = managerContact;
			this.hsmovie = hsmovie;
		}
	public Theatre() {
		// TODO Auto-generated constructor stub
	}
	public HashMap<Integer, Movie> getHsmovie() {
			return hsmovie;
		}
		public void setHsmovie(HashMap<Integer, Movie> hsmovie) {
			this.hsmovie = hsmovie;
		}
		/*
	 * public String[] getMovie() { return movie; } public void setMovie(String[] m)
	 * { movie = m; }
	 */
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
			return "Theatre [theaterId=" + theaterId + ", theaterName=" + theaterName + ", theaterCity=" + theaterCity
					+ ", managerName=" + managerName + ", managerContact=" + managerContact + ", hsmovie=" + hsmovie
					+ "]";
		}
}
