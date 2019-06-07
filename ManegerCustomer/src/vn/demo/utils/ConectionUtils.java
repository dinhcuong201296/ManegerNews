package vn.demo.utils;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionUtils {
public static Connection getConection() {
	final String url="jdbc:mysql://localhost:3306/btvn";
	final String user="root";
	final String password="cuongbom96";
	try {
		Class.forName("com.mysql.jdbc.Driver");
		try {
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
}
	

}
