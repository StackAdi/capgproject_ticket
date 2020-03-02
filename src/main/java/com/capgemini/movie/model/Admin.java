package com.capgemini.movie.model;

public class Admin {
		private String adminId ;
		private String adminName ; 
		private String adminPassword ;
		private String dateOfBirth ;
		private String adminContact ;

		public Admin(String adminId, String adminName, String adminPassword, String dateOfBirth, String adminContact) {
			super();
			this.adminId = adminId;
			this.adminName = adminName;
			this.adminPassword = adminPassword;
			this.dateOfBirth = dateOfBirth;
			this.adminContact = adminContact;
		}
		public String getAdminId() {
			return adminId;
		}
		public void setAdminId(String adminId) {
			this.adminId = adminId;
		}
		public String getAdminName() {
			return adminName;
		}
		public void setAdminName(String adminName) {
			this.adminName = adminName;
		}
		public String getAdminPassword() {
			return adminPassword;
		}
		public void setAdminPassword(String adminPassword) {
			this.adminPassword = adminPassword;
		}
		public String getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(String dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		public String getAdminContact() {
			return adminContact;
		}
		public void setAdminContact(String adminContact) {
			this.adminContact = adminContact;
		}
		

}
