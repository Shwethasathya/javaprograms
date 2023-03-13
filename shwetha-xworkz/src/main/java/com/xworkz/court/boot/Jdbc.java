package com.xworkz.court.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {
	public static void main(String[] args) {
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "root",
					"Xworkzodc@1234");) {
		
			Statement statement = con.createStatement();
			String strQuery = "insert into court values(0,'family','mangalore','divorse',3,2024)";
			int ref = statement.executeUpdate(strQuery);
			System.out.println("rows affected " +ref);
			
			String strQuery1 = "update court set location='andra pradesh' where id=3";
			int updateQuery = statement.executeUpdate(strQuery1);
			System.out.println("updated " +updateQuery);

			String deleteQuery = "delete from court where location='mangalore'";
			int delete = statement.executeUpdate(deleteQuery);
			System.out.println("deleted " + delete);
			
		}  catch (SQLException exception) {
			System.out.println("SQLException");
		}
		
	}
}
