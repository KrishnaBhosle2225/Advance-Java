package JDBC_ODBC;
import java.sql.*;
import java.util.*;
public class Insert_Data_By_cmd {

	public Insert_Data_By_cmd()
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter ID :");
		int id=sc.nextInt();
		System.out.println(id);
		
		System.out.println("Enter Name :");
		String name=sc.next();
		System.out.println(name);
		
		System.out.println("Enter College name:");
		String clg=sc.next();
		System.out.println(clg);
		
		try 
		{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","");
			System.out.println("Connection got succcessful");
			
			String sql=String.format("insert into mytable values(%d,'%s','%s')",id,name,clg);
			
			PreparedStatement ps=con.prepareStatement(sql);
			
			ps.executeUpdate();
			
			System.out.println("Data Inserted :)");
			con.close();
			
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args)
	{
		

		new Insert_Data_By_cmd();
	}
	
	

}
