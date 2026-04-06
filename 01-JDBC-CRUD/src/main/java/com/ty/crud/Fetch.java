package com.ty.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Fetch {

	public static void main(String[] args) {
		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/demo?user=postgres&password=root";

		try {
			Class.forName(driver);

			Connection con = DriverManager.getConnection(url);

			Statement stm = con.createStatement();

			String query = "SELECT * FROM student";

			ResultSet rs = stm.executeQuery(query);

			System.out.println("-----Students-----");

			while (rs.next()) {
				System.out.println("Sid : " + rs.getInt("sid"));
				System.out.println("Name : " + rs.getString(2));
				System.out.println("Email : " + rs.getString(3));
				System.out.println("Phone : " + rs.getLong(4));
				System.out.println("-------------");
			}

			con.close();

			System.out.println("records fetched");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
