package User;

import java.io.*;
import java.sql.*;
import java.util.*;

public class Quiz_Signup 
{
	public static void main(String[] args) throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/User?useSSL=false","root","root");
		
		con.setAutoCommit(false);
		
		System.out.println("Welcome to Java Online Quiz");
		Thread.sleep(1500);
		System.out.println("To attend Quiz Please First Register Yourself");
		Thread.sleep(1500);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner s=new Scanner(System.in);
			while(true)
			{ 
		
				System.out.println("Name:");
				String username =br.readLine();
				System.out.println("Email Id:");
				String EmailId=null;
				String Email =br.readLine();
				boolean email=Email.matches("[a-zA-Z0-9]+@[a-zA-Z0-9.]+");
				if(email)
				{
					System.out.println("Email Id Valid");
				}
				else
				{
					System.out.println("please enter valid mailid Format");
					EmailId =br.readLine();
					System.out.println("Valid");
				}
				
				System.out.println("Password:");
				String password =br.readLine();
				System.out.println("Mobile No:");
				long mobile =s.nextLong();
		
						
				PreparedStatement signup = con.prepareStatement("insert into signup values(?,?,?,?)");
				signup.setString(1, username);
				signup.setString(2, EmailId);
				signup.setString(3, password);
				signup.setLong(4, mobile);
				int data=signup.executeUpdate();
				
				System.out.println("Make sure Above details are correct[Y/N]");  
				String ans=br.readLine();  
				if(ans.equals("Y"))
				{  
					con.commit();
				}
				else
				{
					System.out.println("Not Registered");
					break;
				}
				
				if(data>0)
				{
					System.out.println("Registered Sucessfully");
				}
				con.close();
				Quiz_Login.Login();
			}
	}
}
