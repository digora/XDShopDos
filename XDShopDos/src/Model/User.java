package Model;

import java.util.*;
import java.sql.*;

public class User {
	private String username;
	private Double credits;
	private String fname;
	private String lname;

	public User() {
	};

	public User(String username, Double credits, String fname, String lname){
		 this.username = username;
		 this.credits = credits;
		 this.fname = fname;
		 this.lname = lname;
	}

	public void setUsername(String username){
		this.username = username;
	}
	public void setCredits(Double credits){
		this.credits = credits;
	}
	public void setFname(String fname){
		this.fname = fname;
	}
	public void setLname(String lname){
		this.lname = lname;
	}

	public String getUsername(){
		return username;
	}
	public Double getCredits(){
		return credits;
	}
	public String getFname(){
		return fname;
	}
	public String getLname(){
		return lname;
	}

	
	
	public static User toUser(ResultSet rs){
		User u = new User();
		try{
			u.setUsername(rs.getString("username"));
			u.setFname(rs.getString("fname"));
			u.setLname(rs.getString("lname"));
			u.setCredits(rs.getDouble("credits"));
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return u;
	}

}