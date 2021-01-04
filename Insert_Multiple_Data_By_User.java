package JDBC_ODBC;

import java.sql.*;
import java.util.Scanner;
public class Insert_Multiple_Data_By_User 
{
	
	Connection con;
	Statement st;
	Scanner sc;
	public Insert_Multiple_Data_By_User() 
	{
		
		while(true)
		{
			sc = new Scanner(System.in);
			System.out.println("Enter Roll no: ");
			int roll_no = sc.nextInt();
			
			System.out.println("Enter Name: ");
			String name = sc.next();
			
			System.out.println("Enter Address :");
			String addr = sc.next();
			
			try {
				
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","");
				
				String sql = String.format("insert into mytable values(%d,'%s','%s')",roll_no,name,addr);
				
				st = con.createStatement();
				
				st.executeUpdate(sql);
				
				System.out.println("Data inserted Successfully");
				
				System.out.println("Do you want to insert more data");
				
				String option = sc.next();
				
				if(option.equalsIgnoreCase("no"))
				{
					System.exit(0);
				}
				
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
		
		
		
	}

	public static void main(String[] args)
	{
		new Insert_Multiple_Data_By_User();

	}

}
