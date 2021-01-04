package JDBC_ODBC;

import java.sql.*;


public class Select_Query_Expl
{

	public Select_Query_Expl() {

		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","");
			
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery("select * from mytable");
			
			Boolean flag = false;
			
			while(rs.next())
			{
				flag = true;
				
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
				
			}
			if(flag == false)
			{
				
				System.out.println("No data found");
				
			}
			
		}
		catch(Exception e){
			
			System.out.println(e);
		}
	}

	public static void main(String[] args) 
	{
	
		new Select_Query_Expl();
	}

}
