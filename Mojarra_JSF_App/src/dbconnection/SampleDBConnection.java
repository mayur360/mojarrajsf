package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SampleDBConnection {
	public boolean connection() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		String dbtime1, dbtime2;
		String dbUrl = "jdbc:mysql://localhost:3306/student";

		String query = "Select fname FROM student_info";

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(dbUrl, "root", "root");
		Statement stmt = con.createStatement();

		ResultSet rs = stmt.executeQuery(query);
		System.out.println("Records in Database");

		while (rs.next()) {
			dbtime1 = rs.getString(1);
			System.out.println("fname" + dbtime1);

		} // end while

		/*
		 * PreparedStatement stmt1 = con.prepareStatement(query1, ResultSet.TYPE_SCROLL_INSENSITIVE);
		 * 
		 * stmt1.setInt(1, 101); stmt1.setString(2, "Prashant"); int rowcount = stmt1.executeUpdate();
		 * System.out.println("Rows Updated "+rowcount);
		 * 
		 * /*while (rs1.next()) { dbtime1 = rs1.getString(1); dbtime2 = rs1.getString(2);
		 * System.out.println("Emp_id:"+dbtime1+"  Emp-name: "+dbtime2);
		 * 
		 * } //end while
		 */

		return true;

	}
}
