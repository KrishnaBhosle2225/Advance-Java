package JDBC_ODBC;
import java.sql.*;
import java.util.*;

public class Delete_Multiple_Rows_By_CMD 
{

	public Delete_Multiple_Rows_By_CMD() {
		
		
		try {
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","");
			
			Statement st = con.createStatement();

			while(true)
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter ID which you want to delete");
				int id = sc.nextInt();
				
				String sql =String.format("delete from mytable where id=%d",id);
						
				int count = st.executeUpdate(sql);
				
				count +=1;
				
				System.out.println("Do you want to Delete one more data (yes/no)");
				String option = sc.next();
				
				if(option.equalsIgnoreCase("No"))
				{
					System.out.println(count +" Row Deleted");
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

		new Delete_Multiple_Rows_By_CMD();

	}

}
