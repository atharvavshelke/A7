package com.ty.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CloseConn2 {

	public static void main(String[] args) {

		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/demo";
		String user = "postgres";
		String password = "root";

		try {
			Class.forName(driver);
			System.out.println("driver loaded");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try (Connection con = DriverManager.getConnection(url, user, password)) {
			Statement stm = con.createStatement();

			String query = "UPDATE student SET phone=4567890 WHERE sid=101";

			stm.execute(query);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
