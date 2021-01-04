package JDBC_ODBC;

import java.sql.*;
import java.util.*;

public class Update_Data {

	public Update_Data() {
		
		try {
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","");
		
		Statement st = con.createStatement();
		
		String sql = "update mytable set name='mahesh' where id = 41";
		
		st.executeUpdate(sql);
		
		System.out.println("Data updated Successfully");
		
		String select_query = "select * from mytable ";
		
		ResultSet rs = st.executeQuery(select_query);
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3));
		}
		}catch(Exception e)
	{
			System.out.println(e);
	}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Update_Data();
	}

}
