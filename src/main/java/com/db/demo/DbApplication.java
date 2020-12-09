package com.db.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DbApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbApplication.class, args);
		
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/acctask","root","");  
			
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from Aliens");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));  
			con.close();  
			}catch(Exception e){ System.out.println(e);}  
			}  
	}


