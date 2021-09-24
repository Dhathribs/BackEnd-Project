package Admin;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.Scanner;

public class Quiz_info 
{
	public static void main(String[] args) throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Admin_info?useSSL=false","root","root");
		
		Scanner s=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		while(true)
		{
		System.out.println("Which operation do you want to perform:");
		System.out.println("1) Update");
		System.out.println("2) Insert");
		System.out.println("3) Delete");
		int data = s.nextInt();
		switch(data)
		{
			case 1:
				System.out.println("Enter Question");
				String ques=br.readLine();
				System.out.println("Enter Answer");
				String ans=br.readLine();

				System.out.println("Enter Question No to Update");
				int qno=s.nextInt();
				String update="update quiz_info_admin set Questions=?,Answers=? where Ques_No=?";
				PreparedStatement ps=con.prepareStatement(update);
					ps.setString(1, ques);
					ps.setString(2, ans);
					ps.setInt(3, qno);
				ps.executeUpdate();
				System.out.println("Record Updated");
				break;
				
			case 2:
				System.out.println("Enter Question No to Update");
				int qno1=s.nextInt();
				System.out.println("Enter Question");
				String ques1=br.readLine();
				System.out.println("Enter Answer");
				String ans1=br.readLine();
				String insert="insert into quiz_info_admin values(?,?,?)";
				PreparedStatement ps1=con.prepareStatement(insert);
					ps1.setInt(1, qno1);
					ps1.setString(2, ques1);
					ps1.setString(3, ans1);
				ps1.executeUpdate();
				System.out.println("Record Inserted");
				break;
				
			case 3:
				System.out.println("Enter Question No to Delete");
				int qno2=s.nextInt();
				String delete="delete from quiz_info_admin where Ques_No=?";
				PreparedStatement ps2=con.prepareStatement(delete);
					ps2.setInt(1, qno2);
				ps2.executeUpdate();
				System.out.println("Record Deleted");
				break;
			
			default:
				System.out.println("Cannot Perform");
		}
	}
	}
}
