/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author mwn
 */
public class DBConnector {

	private Connection connection = null;
	
	//Constants
	private static final String IP	     = "104.248.23.252";
	private static final String PORT     = "3306";
	public  static final String DATABASE = "classicmodels";
	private static final String USERNAME = "mads"; 
	private static final String PASSWORD = "afmsaMKLNFidfs8us§_dij";	     	
	
	public DBConnector() throws Exception {
   		Class.forName("com.mysql.jdbc.Driver").newInstance();
   		String url = "jdbc:mysql://" + IP + ":" + PORT + "/" + DATABASE;
   		this.connection = (Connection) DriverManager.getConnection(url, USERNAME, PASSWORD);
	}
	
	public Connection getConnection() {
   		return this.connection;
	}
}
