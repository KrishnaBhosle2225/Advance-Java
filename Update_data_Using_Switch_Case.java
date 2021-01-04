package JDBC_ODBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class Update_data_Using_Switch_Case {

	
	public void updateData() throws SQLException
	{
		
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/asciieducation","root","");
		
		System.out.println("Connection Okk");
		Statement st = con.createStatement();
		Statement st1 = con.createStatement();
		Statement st2 = con.createStatement();
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			
			
			
			
			System.out.println("Enter Your Choice :\n1.Update name: \n2.Update email: \n3.Update mobile no:");
			
			int ch = sc.nextInt();
			
			switch(ch){
			
			case 1:
			{
//				
//				System.out.println("Enter Student ID :");
//				int id = sc.nextInt();  
//				
//				System.out.println("Enter Student Name :");
//				String name = sc.next();
				
				String sql = String.format("update student set name ='Bhagesh' where id = '100'");
				int i =st. executeUpdate(sql);
				System.out.println("Name updated Successfully");
				break;
			}
			
			case 2:
			{
				String sql = String.format("update student set email ='Krish@gmail.com' where id = '100'") ;
				int i =st1. executeUpdate(sql);
				System.out.println("Email updated Successfully");
				break;
			}
			
			case 3:
			{
				String sql = String.format("update student set phone ='99999999' where id = '100'") ;
				int i =st2. executeUpdate(sql);
				System.out.println("Phone updated Successfully");
				break;
			}
			
			
			}
			

		}	
		
	}
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Update_data_Using_Switch_Case obj = new Update_data_Using_Switch_Case();
			obj.updateData();
	}

}
