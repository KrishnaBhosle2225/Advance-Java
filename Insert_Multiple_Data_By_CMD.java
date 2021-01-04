package JDBC_ODBC;

import java.sql.*;
import java.util.*;

public class Insert_Multiple_Data_By_CMD {

	
	public Insert_Multiple_Data_By_CMD() {
		
		try {
			
			
		while(true)
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Student ID :");
			int id = sc.nextInt();
			
			System.out.println("Enter Student Name :");
			String name = sc.next();
			
			System.out.println("Enter Student Address :");
			String addr = sc.next();
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","");
			
			Statement st = con.createStatement();
			
			String sql = String.format("insert into mytable values(%d,'%s','%s')",id,name,addr);
			
			int count = st.executeUpdate(sql);
			
			count += 1;
			
			System.out.println("Do you want to insert one more data");
			String option = sc.next();
			
			if(option.equalsIgnoreCase("no"))
			{
				System.out.println(count+" Row inserted");
				System.out.println("Thank you for Inserting Data");
				break;
			}
		}
		
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Insert_Multiple_Data_By_CMD();
	}

}
