package JDBC_ODBC;

import java.sql.*;
import java.util.*;



public class Delete_Multiple_Rows_By_User 
{

	public Delete_Multiple_Rows_By_User()
	{
		Connection con;
		Statement st;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter cutoff roll no :");
		
		Double cutoff=sc.nextDouble();
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","");
			
			st = con.createStatement();
			
			String sql = String.format("delete from mytable where id = %f",cutoff);
			
			int count=st.executeUpdate(sql);
			
			System.out.println("The number of rows deleted : "+count);
			
			
			
			
		} catch (SQLException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Delete_Multiple_Rows_By_User();
		
	}

}
