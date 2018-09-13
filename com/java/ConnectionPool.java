//not more than 100 connections
//no one should be able to directly call a new Connection() to get a connection object
//Everyone should call Connection.getInstance() method to get a connection objecTt
//we should not have more than one connection pool
package com.java;
public class ConnectionPool {
	static int con = 0;
	static Connection add = null;
	public static Connection getInstance(){
		if (con< 100){
			con++;
			add = Connection.addConnection();
			System.out.println("Connection added successfuly" + con);
		}
		return add;	
	}
	
	static class Connection{

		public Connection() {
			Connection add =null;
			
		}

		static Connection addConnection() {
			if(add == null)
				return new Connection();
			return add;
		}	
	}
	
	public static void main(String[] args) {
		ConnectionPool.getInstance();
	}
}
