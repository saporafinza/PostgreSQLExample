package com.saporafinza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dataAccess {
	static String url = "jdbc:postgresql://localhost:5432/dburun";
	static Connection conn = null;
	
	static void acces() {
		try {
			conn = DriverManager.getConnection(url, "postgres","1453");
			System.out.println("Bağlantı gerçekleşti!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static ResultSet listele(String sorgu) {
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sorgu);
			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

}
