package JDBC_ODBC;

import java.sql.*;

public class Create_Table {

	
	Connection con;
	
	public Create_Table()
	{
		
			
			try {
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root123","");
		
			System.out.println("Connection got successfully"); 
			
			String sql= "create table Demo (id integer,name varchar(100),college varchar(100))";
			Statement st = con.createStatement();
			
			st.executeUpdate(sql);
			
			System.out.println("Table created Successfully");
			
			} 
			catch (SQLException e)
			{
				
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
		
		
	}
	
	public static void main(String[] args) 
	{
		
		new Create_Table();
		

	}

}
