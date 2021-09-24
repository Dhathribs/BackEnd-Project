package User;

import java.sql.*;
import java.util.Scanner;

public class Quiz_ques 
{
	static int count=0;
	public static void Questions() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Admin_info?useSSL=false","root","root");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/User?useSSL=false","root","root");
		

			boolean st=false;
		
			System.out.println("Welcome to Java Online Quiz");
			Thread.sleep(1000);
			System.out.println("Questions:");
			Scanner s=new Scanner(System.in);
			
			
//1 Question
			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery("select Ques_No,Questions from quiz_info_admin where Ques_No=1;");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+") "+rs.getString(2));
			}
			
			System.out.println("A)Null");
			System.out.println("B)0");
			System.out.println("C)Depends upon the type of variable");
			System.out.println("D)Not Assigned");
			System.out.println("Answer: ");
			String ans =s.nextLine();
			
			PreparedStatement ps=con.prepareStatement("select Answers from quiz_info_admin where Answers='"+ans+"' and Ques_No=1");
			ResultSet r= ps.executeQuery();
			st=r.next();
			
			if(st==true)
			{
				System.out.println("Correct Answer "+r.getString(1));					
				PreparedStatement ps1=conn.prepareStatement("insert into quiz_info (Answers) values(?)");
					ps1.setString(1, ans);
				ps1.executeUpdate();
				count++;
			}
			else
			{
				System.out.println("Wrong Answer...");
			}
			rs.close();

			
//2 Question		
			Statement stm1=con.createStatement();
			ResultSet rs1=stm1.executeQuery("select Ques_No,Questions from quiz_info_admin where Ques_No=2");
			while(rs1.next())
			{
				System.out.println(rs1.getString(1)+") "+rs1.getString(2));
			}
			System.out.println("A)8 bit");
			System.out.println("B)16 bit");
			System.out.println("C)32 bit");
			System.out.println("D)64 bit");
			System.out.println("Answer: ");
			String ans1 =s.nextLine();
			
			PreparedStatement ps1=con.prepareStatement("select Answers from quiz_info_admin where Answers='"+ans1+"' and Ques_No=2");
			ResultSet r1= ps1.executeQuery();
			st=r1.next();
			
			if(st==true)
			{
				System.out.println("Correct Answer "+r1.getString(1));					
				PreparedStatement ps2=conn.prepareStatement("insert into quiz_info (Answers) values(?)");
					ps2.setString(1, ans1);
				ps2.executeUpdate();
				count++;
			}
			else
			{
				System.out.println("Wrong Answer...");
			}
			rs.close();
	
			
//3 Question
			Statement stm2=con.createStatement();
			ResultSet rs2=stm2.executeQuery("select Ques_No,Questions from quiz_info_admin where Ques_No=3");
			while(rs2.next())
			{
				System.out.println(rs2.getString(1)+") "+rs2.getString(2));
			}
			System.out.println("A)0.0d");
			System.out.println("B)0.0f");
			System.out.println("C)null");
			System.out.println("D)Not Defined");
			System.out.println("Answer: ");
			String ans2 =s.nextLine();
			
			PreparedStatement ps2=con.prepareStatement("select Answers from quiz_info_admin where Answers='"+ans2+"' and Ques_No=3");
			ResultSet r2= ps2.executeQuery();
			st=r2.next();
			
			if(st==true)
			{
				System.out.println("Correct Answer "+r2.getString(1));					
				PreparedStatement ps3=conn.prepareStatement("insert into quiz_info (Answers) values(?)");
					ps3.setString(1, ans2);
				ps3.executeUpdate();
				count++;
			}
			else
			{
				System.out.println("Wrong Answer...");
			}
			rs.close();
			
			
//4 Question			
			Statement stm3=con.createStatement();
			ResultSet rs3=stm3.executeQuery("select Ques_No,Questions from quiz_info_admin where Ques_No=4;");
			while(rs3.next())
			{
				System.out.println(rs3.getString(1)+") "+rs3.getString(2));
			}
			System.out.println("A)0.0");
			System.out.println("B)0");
			System.out.println("C)null");
			System.out.println("D)None of the above");
			System.out.println("Answer: ");
			String ans3 =s.nextLine();
			
			PreparedStatement ps3=con.prepareStatement("select Answers from quiz_info_admin where Answers='"+ans3+"' and Ques_No=4");
			ResultSet r3= ps3.executeQuery();
			st=r3.next();
			
			if(st==true)
			{
				System.out.println("Correct Answer "+r3.getString(1));					
				PreparedStatement ps4=conn.prepareStatement("insert into quiz_info (Answers) values(?)");
					ps4.setString(1, ans3);
				ps4.executeUpdate();
				count++;
			}
			else
			{
				System.out.println("Wrong Answer...");
			}
			rs.close();
			
			
//5 Question			
			Statement stm4=con.createStatement();
			ResultSet rs4=stm4.executeQuery("select Ques_No,Questions from quiz_info_admin where Ques_No=5;");
			while(rs4.next())
			{
				System.out.println(rs4.getString(1)+") "+rs4.getString(2));
			}
			System.out.println("A)Technique of combining more than one member functions into a single unit.");
			System.out.println("B)Mechanism of combining more than one data member into a single unit.");
			System.out.println("C)Mechanism of combining more than one data members and member functions that implement on those data members into a single unit");
			System.out.println("D)None of the above.");
			System.out.println("Answer: ");
			String ans4 =s.nextLine();
	
			PreparedStatement ps4=con.prepareStatement("select Answers from quiz_info_admin where Answers='"+ans4+"' and Ques_No=5");
			ResultSet r4= ps4.executeQuery();
			st=r4.next();
			
			if(st==true)
			{
				System.out.println("Correct Answer "+r4.getString(1));					
				PreparedStatement ps5=conn.prepareStatement("insert into quiz_info (Answers) values(?)");
					ps5.setString(1, ans4);
				ps5.executeUpdate();
				count++;
			}
			else
			{
				System.out.println("Wrong Answer...");
			}
			rs.close();
			
			
//6 Question			
			Statement stm5=con.createStatement();
			ResultSet rs5=stm5.executeQuery("select Ques_No,Questions from quiz_info_admin where Ques_No=6;");
			while(rs5.next())
			{
				System.out.println(rs5.getString(1)+") "+rs5.getString(2));
			}
			System.out.println("A)Yes");
			System.out.println("B)No");
			System.out.println("Answer: ");
			String ans5 =s.nextLine();
	
			PreparedStatement ps5=con.prepareStatement("select Answers from quiz_info_admin where Answers='"+ans5+"' and Ques_No=6");
			ResultSet r5= ps5.executeQuery();
			st=r5.next();
			
			if(st==true)
			{
				System.out.println("Correct Answer "+r5.getString(1));					
				PreparedStatement ps6=conn.prepareStatement("insert into quiz_info (Answers) values(?)");
					ps6.setString(1, ans5);
				ps6.executeUpdate();
				count++;
			}
			else
			{
				System.out.println("Wrong Answer...");
			}
			rs.close();
			
			
//7 Question
			Statement stm6=con.createStatement();
			ResultSet rs6=stm6.executeQuery("select Ques_No,Questions from quiz_info_admin where Ques_No=7;");
			while(rs6.next())
			{
				System.out.println(rs6.getString(1)+") "+rs6.getString(2));
			}
			System.out.println("A)Variables defined inside methods, constructors or blocks are called local variables.");
			System.out.println("B)Variables defined outside methods, constructors or blocks are called local variables.");
			System.out.println("C)Static variables defined outside methods, constructors or blocks are called local variables.");
			System.out.println("D)None of the above.");
			System.out.println("Answer: ");
			String ans6 =s.nextLine();
	
			PreparedStatement ps6=con.prepareStatement("select Answers from quiz_info_admin where Answers='"+ans6+"' and Ques_No=7");
			ResultSet r6= ps6.executeQuery();
			st=r6.next();
			
			if(st==true)
			{
				System.out.println("Correct Answer "+r6.getString(1));					
				PreparedStatement ps7=conn.prepareStatement("insert into quiz_info (Answers) values(?)");
					ps7.setString(1, ans6);
				ps7.executeUpdate();
				count++;
			}
			else
			{
				System.out.println("Wrong Answer...");
			}
			rs.close();
			
			
//8 question
			Statement stm7=con.createStatement();
			ResultSet rs7=stm7.executeQuery("select Ques_No,Questions from quiz_info_admin where Ques_No=8;");
			while(rs7.next())
			{
				System.out.println(rs7.getString(1)+") "+rs7.getString(2));
			}
			System.out.println("A)It is used to create syncronized code.");
			System.out.println("B)It is used to initialize the static data member., It is excuted before main method at the time of class loading.");
			System.out.println("C)There is no such block.");
			System.out.println("D)None of the above.");
			System.out.println("Answer: ");
			String ans7 =s.nextLine();
	
			PreparedStatement ps7=con.prepareStatement("select Answers from quiz_info_admin where Answers='"+ans7+"' and Ques_No=8");
			ResultSet r7= ps7.executeQuery();
			st=r7.next();
			
			if(st==true)
			{
				System.out.println("Correct Answer "+r7.getString(1));					
				PreparedStatement ps8=conn.prepareStatement("insert into quiz_info (Answers) values(?)");
					ps8.setString(1, ans7);
				ps8.executeUpdate();
				count++;
			}
			else
			{
				System.out.println("Wrong Answer...");
			}
			rs.close();
			
			
//9 Question
			Statement stm8=con.createStatement();
			ResultSet rs8=stm8.executeQuery("select Ques_No,Questions from quiz_info_admin where Ques_No=9;");
			while(rs8.next())
			{
				System.out.println(rs8.getString(1)+") "+rs8.getString(2));
			}
			System.out.println("A)String Builder");
			System.out.println("B)String Buffer");
			System.out.println("Answer: ");
			String ans8 =s.nextLine();
	
			PreparedStatement ps8=con.prepareStatement("select Answers from quiz_info_admin where Answers='"+ans8+"' and Ques_No=9");
			ResultSet r8= ps8.executeQuery();
			st=r8.next();
			
			if(st==true)
			{
				System.out.println("Correct Answer "+r8.getString(1));					
				PreparedStatement ps9=conn.prepareStatement("insert into quiz_info (Answers) values(?)");
					ps9.setString(1, ans8);
				ps9.executeUpdate();
				count++;
			}
			else
			{
				System.out.println("Wrong Answer...");
			}
			rs.close();
			
			
//10 Question
			Statement stm9=con.createStatement();
			ResultSet rs9=stm9.executeQuery("select Ques_No,Questions from quiz_info_admin where Ques_No=10;");
			while(rs9.next())
			{
				System.out.println(rs9.getString(1)+") "+rs9.getString(2));
			}
			System.out.println("A)Synchronization is the capability to control the access of multiple threads to shared resources.");
			System.out.println("B)Synchronization is the process of writing the state of an object to another object.");
			System.out.println("C)Synchronization is the process of writing the state of an object to byte stream.");
			System.out.println("D)None of the above.");
			System.out.println("Answer: ");
			String ans9 =s.nextLine();
	
			PreparedStatement ps9=con.prepareStatement("select Answers from quiz_info_admin where Answers='"+ans9+"' and Ques_No=10");
			ResultSet r9= ps9.executeQuery();
			st=r9.next();
			
			if(st==true)
			{
				System.out.println("Correct Answer "+r9.getString(1));					
				PreparedStatement p=conn.prepareStatement("insert into quiz_info (Answers) values(?)");
					p.setString(1, ans9);
				p.executeUpdate();
				count++;
			}
			else
			{
				System.out.println("Wrong Answer...");
			}
			con.close();
			conn.close();
			System.out.println("Your score is "+count+"/10");
	}
	public static void main(String[] args) throws Exception 
	{
		Questions();
	}
}
