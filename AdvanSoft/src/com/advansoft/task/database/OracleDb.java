package com.advansoft.task.database;


import java.sql.*;

/**
 * This class provides methods for creating connections 
 * to Oracle DB and executing queries
 * @author Siddiq Ahmed Syed
 *
 */
public class OracleDb {
	Connection con;
	Statement stmt;
	public OracleDb(String name,String password) {
		createConnection(name,password);
		
	}
	  /**
	   * This method does the setup needed 
	   * @param name -username
	   * @param password-password
	   */
	private void createConnection(String name, String password) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",name,password);
			stmt=con.createStatement(); 
					
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}
	/**
	 * This method executes the query and returns the result
	 * @param query -query on the table
	 * @return resultset
	 * @throws SQLException
	 */
	public ResultSet query(String query) throws SQLException{
		ResultSet rs=stmt.executeQuery(query);
		return rs;
	}
	/**
	 * This method updates on the database like create,insert etc
	 * @param query
	 * @throws SQLException
	 */
	public void updateQuery(String query) throws SQLException{
		stmt.executeUpdate(query);
	}
	/**
	 * This method closes the connection which was established earlied
	 * @throws SQLException
	 */
	public void closeConnection() throws SQLException{
		con.close();  
	}


	  
}