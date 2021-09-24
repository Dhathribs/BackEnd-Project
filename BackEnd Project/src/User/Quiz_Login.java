package User;

import java.sql.*;
import java.util.Scanner;

public class Quiz_Login 
{
	public static void Login() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/User?useSSL=false","root","root"); 
		System.out.println("Now you can Login Using your Registered Mail Id and Password ");
		Thread.sleep(1000);
		Scanner s=new Scanner(System.in);
		
		System.out.println("Email Id:");
		String uname =s.nextLine();
		System.out.println("Password:");
		String password =s.nextLine();
		boolean st=false;
		Statement stm=con.createStatement();
		ResultSet rs=stm.executeQuery("select Name from signup WHERE Email_Id='"+uname+"' and Password='"+password+"'");
		st=rs.next();
			if(st==true)
			{
				System.out.println("Name: "+rs.getString(1));
				System.out.println("Successfully Login ");
				PreparedStatement ps=con.prepareStatement("insert into Login values(?,?)");
					ps.setString(1, uname);
					ps.setString(2, password);
					ps.executeUpdate();
				Quiz_ques.Questions();
			}
			else
			{
				System.out.println("Invalid Username and Password");
			}
		
			rs.close();
			con.close();
	}	
	public static void main(String[] args) throws Exception {
		
		Login();
	}
}
