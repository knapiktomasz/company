package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	private static final String URL = "jdbc:mysql://localhost:3306/employee?useSSL=false&useUnicode=true";

	private Connection connection;

	public DatabaseConfig() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}

	public Connection getConnection() throws SQLException {
		if (connection == null) {

			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		}

		return connection;

	}
}
