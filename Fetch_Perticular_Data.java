package JDBC_ODBC;

import java.sql.*;
import java.util.*;
public class Fetch_Perticular_Data
{

	public Fetch_Perticular_Data() 
	{
		
		try {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id of Your require data");
		int id = sc.nextInt();
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","");
		
		Statement st = con.createStatement();
		
		String sql = String.format("select * from mytable where id = %d",id);		
		ResultSet rs = st.executeQuery(sql);
			
		Boolean flag = false;
		while(rs.next())
		{
			flag = true;
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
		}
		
		if(flag==false)
		{
			System.out.println("No such data Available") ;
		}
		
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Fetch_Perticular_Data();
	}

}
