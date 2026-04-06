package com.ty.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

	public static void main(String[] args) {

		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/demo";
		String user = "postgres";
		String password = "root";

		try {
			Class.forName(driver);

			Connection con = DriverManager.getConnection(url, user, password);

			String query = "UPDATE student SET phone=? WHERE sid=?";

			PreparedStatement pstm = con.prepareStatement(query);
			pstm.setInt(2, 105);
			pstm.setLong(1, 9876543210L);

			pstm.execute();

			con.close();

			System.out.println("record updated");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
