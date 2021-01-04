package JDBC_ODBC;
import java.sql.*;

public class DbConnection 
{
	
	public static void main(String[] args) throws Exception
	{
		
//		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/asciieducation";
		
		String user="root";
		
		String pass="";
		
		DriverManager.getConnection(url,user,pass);
		
		System.out.println("Connection got Successfull");
		
	}

}
