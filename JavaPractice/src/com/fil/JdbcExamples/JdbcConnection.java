package com.fil.JdbcExamples;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcConnection {

	public static void main(String[] args)
	{
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306";
		String username = "root";
		String password = "root";
		
		Connection con = DriverManager.getConnection(url,username,password);
		
		if(con.isClosed())
		{
			System.out.println("Connection is closed");
		}
		else
		{
			System.out.println("Connection is created");
		}
		
//		String q= "create table table1"
//				+ "(tId int(20) primary key auto_increment ,tName varchar(200)not null, tCity varchar(400))";
//        Statement stmt=con.createStatement();
//		stmt.executeUpdate(q);
//		System.out.println("Table created in database...");
		
//		String q1 = "insert into table1(tName,tCity) values(?,?)";
//		PreparedStatement pstmt = con.prepareStatement(q1);
//		pstmt.setString(1, "Parth");
//		pstmt.setString(2, "Delhi");
//		pstmt.executeUpdate();
//		System.out.println("Record added");
		
		
		//User record dynamic
	
		//System.out.println("Dynamic record added");
		
//		int cnt = 0;
//		
//		while(cnt<5)
//		{
//			String q2="insert into table1(tName,tCity) values(?,?)";
//			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//			System.out.println("Enter Name: ");
//			String name= br.readLine();
//			System.out.println("Enter City: ");
//			String city= br.readLine();
//			PreparedStatement pstmt1=con.prepareStatement(q2);
//			pstmt1.setString(1, name);
//			pstmt1.setString(2, city);
//			pstmt1.executeUpdate();
//			cnt++;
//		}
		
		//Updating the existing record
//		String q2="update table1 set tName=? ,tCity=? where tId=?";
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter Name: ");
//		String name1= br.readLine();
//		System.out.println("Enter City: ");
//		String city1= br.readLine();
//		System.out.println("Enter new StudentID: ");
//		int id=Integer.parseInt(br.readLine());
//		PreparedStatement pstmt1=con.prepareStatement(q2);
//		pstmt1.setString(1, name1);
//		pstmt1.setString(2, city1);
//		pstmt1.setInt(3, id);
//		pstmt1.executeUpdate();
//		System.out.println("Done........");
		
//		String q3="select * from table1";
//		Statement stmt=con.createStatement();
//	    ResultSet set=stmt.executeQuery(q3);
//	    while(set.next()) {
//	    	int id2=set.getInt("tId");
//	    	String name2=set.getString("tName");
//	    	String city2=set.getString("tCity");
//	    	System.out.println(id2 + " :"+name2 + " :"+city2);
//	    	
//	    }
//	    System.out.println("Done..........");
//	    
//	    con.close();
		
//		String q4="delete from table1 where tid= ?";
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
// 	    System.out.println("Enter ID: ");
// 	    int id=Integer.parseInt(br.readLine());
// 	    
// 	     PreparedStatement pstmt1=con.prepareStatement(q4);
// 	    pstmt1.setInt(1, id);
// 	    pstmt1.executeUpdate();
//		
//	    
//	   
////	    System.out.println("Done..........");
//	    String q5="insert into stuimage(pic) values(?)";
//	    PreparedStatement pstmt2=con.prepareStatement(q5);
//	    FileInputStream fis=new FileInputStream("pic.jpeg");
//	    pstmt2.setBinaryStream(1, fis, fis.available());
//	    pstmt2.executeUpdate();
//	    
//	   System.out.println("Pic Inserted.....");
//	   
	   
	   //Creating database
	   //from url remove jdbcpractice as we're creating new database
//	   String q= "create database sample";
//       Statement stmt=con.createStatement();
//		stmt.executeUpdate(q);
//		System.out.println("database created");
		String q= "create table table1"
		+ "(tId int(20) primary key auto_increment ,tName varchar(200)not null, tCity varchar(400))";
      Statement stmt=con.createStatement();
		stmt.executeUpdate(q);
		System.out.println("Table created in database...");
//	    String q1 = "insert into table1(tName,tCity) values(?,?)";
//		PreparedStatement pstmt = con.prepareStatement(q1);
//		pstmt.setString(1, "Parth");
//		pstmt.setString(2, "Delhi");
//		pstmt.executeUpdate();
//		System.out.println("Record added");
		
	}
		catch(Exception e) {
			System.out.println(e);
		}

	}

	

}
