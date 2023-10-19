package com.fil.JdbcExamples;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class jdbcpratice {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/jdbcpractice";
			String username = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(url, username, password);

			if (con.isClosed()) {
				System.out.println("Connection is closed");
			} else {
				System.out.println("Connection is created");
			}
			System.out.println("Enter choice:");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();

			switch (n) {
			case 1:
				String q = "create table practice"
						+ "(tId int(20) primary key auto_increment ,tName varchar(200)not null, tCity varchar(400))";
				Statement stmt = con.createStatement();
				stmt.executeUpdate(q);
				System.out.println("Table created in database...");
				break;

			case 2:
				int cnt = 0;

				while (cnt < 2) {
					String q2 = "insert into practice(tName,tCity) values(?,?)";
					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					System.out.println("Enter Name: ");
					String name = br.readLine();
					System.out.println("Enter City: ");
					String city = br.readLine();
					PreparedStatement pstmt1 = con.prepareStatement(q2);
					pstmt1.setString(1, name);
					pstmt1.setString(2, city);
					pstmt1.executeUpdate();
					cnt++;
				}
				System.out.println("Table created");
				break;

			case 3:
				// Updating the existing record
				String q2 = "update practice set tName=? ,tCity=? where tId=?";
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter Name: ");
				String name1 = br.readLine();
				System.out.println("Enter City: ");
				String city1 = br.readLine();
				System.out.println("Enter new StudentID: ");
				int id = Integer.parseInt(br.readLine());
				PreparedStatement pstmt1 = con.prepareStatement(q2);
				pstmt1.setString(1, name1);
				pstmt1.setString(2, city1);
				pstmt1.setInt(3, id);
				pstmt1.executeUpdate();
				System.out.println("Updation Done........");
				break;
			case 4:
				String q3 = "select * from practice";
				Statement stmt1 = con.createStatement();
				ResultSet set = stmt1.executeQuery(q3);
				while (set.next()) {
					int id2 = set.getInt("tId");
					String name2 = set.getString("tName");
					String city2 = set.getString("tCity");
					System.out.println(id2 + " :" + name2 + " :" + city2);

				}
				System.out.println("Select done...");
				break;

			case 5:
				String q4 = "delete from practice where tid= ?";
				BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter ID: ");
				int id1 = Integer.parseInt(br1.readLine());
				PreparedStatement pstmt2 = con.prepareStatement(q4);
				pstmt2.setInt(1, id1);
				pstmt2.executeUpdate();

				System.out.println("Deletion Done..........");
				break;
				
			case 6:
				
				String q5="drop table practice";
				PreparedStatement pstmt3 = con.prepareStatement(q5);
				
				pstmt3.executeUpdate();
				System.out.println("Table deleted");

				break;
				

			default:
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
