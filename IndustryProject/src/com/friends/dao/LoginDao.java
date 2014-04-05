package com.friends.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;


import com.friends.dbcon.DBConnection;
import com.friends.util.IndustryConstants;

public class LoginDao {
	 
	 public int insert(String un,String pw){
	  int r=0;
	  PreparedStatement ps = null;
	  //get connection object from DBConnection class
	  Connection con = DBConnection.dbConn();
	  System.out.println("Connection"+con);
	 
	  try{
			  //use PreparedStatement to insert the values of username and password
	   ps=con.prepareStatement("insert into USER_MASTER(USER_NAME,PASSWORD) values(?,?)"); 
	   ps.setString(1, un);
	   ps.setString(2, pw);
	   r = ps.executeUpdate(); 
	   System.out.println(IndustryConstants.USER_ADD_SUCCESS);
	  }
	  catch(Exception ex) {
		  System.err.println("Exception: " + ex.getMessage());
	  }
	  return r;
	 
	 }
	}
