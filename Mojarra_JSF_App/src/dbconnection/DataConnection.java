package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class DataConnection {
	private ResourceBundle rbundle = null;
	String databaseURL, databaseDriver, databaseUser, databasePwd;
	private Connection dataConn;

	public boolean connect() throws SQLException, ClassNotFoundException {
		try {
			rbundle = ResourceBundle.getBundle("dbconnection.dataconnection");
		} catch (Exception e) {
			System.out.println("Resource Bundle file not found.");
			e.printStackTrace();
		}
		databaseURL = rbundle.getString("DBURL");
		databaseDriver = rbundle.getString("DBDRIVER");
		databaseUser = rbundle.getString("DBUSERNAME");
		databasePwd = rbundle.getString("DBPASSWORD");
		System.out.println("JDBC Driver " + databaseDriver);
		Class.forName(databaseDriver);
		System.out.println("Getting data connection");
		dataConn = DriverManager.getConnection(databaseURL, databaseUser, databasePwd);
		System.out.println("Data Connection object is " + dataConn);
		return true;
	}

	public void close() throws SQLException {
		dataConn.close();
	}

	public ResultSet execSQL(String sql) throws SQLException {
		Statement s = dataConn.createStatement();
		ResultSet r = s.executeQuery(sql);
		return (r == null) ? null : r;
	}

	public String execUpdate(String sql) throws SQLException {
		Statement s = dataConn.createStatement();
		int r = s.executeUpdate(sql);
		return (r == 0) ? null : r + "rows updated Successfully";
	}

}
