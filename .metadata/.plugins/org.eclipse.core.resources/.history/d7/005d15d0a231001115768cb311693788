package com.ty.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Save {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/demo";
		String user = "postgres";
		String password = "root";

		try {
			// step 1 : Load the driver
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver loaded");

			// step 2 : Establish the connection
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("Connection created");

			// step 3 : create a statement
			Statement stm = con.createStatement();
			System.out.println("Statement created");

			String query = "INSERT INTO student VALUES(103,'Manga','manga@gmail.com',87657)";

			// step 4 : Execute the query
			System.out.println(stm.execute(query));
			System.out.println("record saved");

			// step 5 : Close the connection
			con.close();
			System.out.println("connection is closed");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
