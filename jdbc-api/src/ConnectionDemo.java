import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class ConnectionDemo {

	public static void main(String[] args) {
//String url = "jdbc:mysql://localhost:3306/training";
		try {
			/*
			 * Driver driver = new Driver(); DriverManager.registerDriver(driver);
			 * Connection conn= DriverManager.getConnection(url,"root","12345");
			 * System.out.println("Connection Successful");
			 */
			Connection conn = JdbcFactory.getConnection();
			System.out.println("Connection Successfully");
			DatabaseMetaData meta = conn.getMetaData();
			System.out.println("DB Name: " + meta.getDatabaseProductName());
			System.out.println("DB version: " + meta.getDatabaseProductVersion());
			System.out.println("Driver name: " + meta.getDriverName());
			System.out.println("Driver ver: " + meta.getDriverVersion());
		} catch (SQLException e) {
			System.out.println("Connection failed! ");
			e.printStackTrace();
		}
	}

}
