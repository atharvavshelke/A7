package com.ty.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Fetch {

	public static void main(String[] args) {
		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/demo";
		String user = "postgres";
		String password = "root";

		try {
			Class.forName(driver);

			Connection con = DriverManager.getConnection(url, user, password);

			Statement stm = con.createStatement();

			String query = "SELECT * FROM student";

			ResultSet rs = stm.executeQuery(query);

			System.out.println("-----Students-----");

			while (rs.next()) {
				int sid = rs.getInt("sid");
				String name = rs.getString(2);
				String email = rs.getString(3);
				long phone = rs.getLong(4);

				System.out.println("Sid : " + sid);
				System.out.println("Name : " + name);
				System.out.println("Email : " + email);
				System.out.println("Phone : " + phone);
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
