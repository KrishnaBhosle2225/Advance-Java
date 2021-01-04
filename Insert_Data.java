package JDBC_ODBC;

import java.sql.*;
public class Insert_Data {

	Connection con;
	
	public Insert_Data()
	{
		try 
		{
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","");
			System.out.println("Connection got succsessful");
			
			String sql="insert into mytable values(21,'Krishna Bhosle','zeal college')";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.executeUpdate();
			System.out.println("Data inserted Successfully");
			
			
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) 
	{
		new Insert_Data();

	}

}
