package org.bridgelabz.loginApp;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class InsertPractice {
  public static void main(String args[])
  {
	  Connection con=null;
	  PreparedStatement pstmt=null;
	  String qry="insert into loginDb.student values(?,?,?)";
	  try{
		  Class.forName("com.mysql.jdbc.Driver");
		  System.out.println("Driver loaded and registered");
		  con=DriverManager.getConnection("jdbc:mysql://localhost;3306?user=root&password=2vd12cs025");
	  }
  }
}
