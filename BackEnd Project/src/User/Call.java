package User;
import java.util.Scanner;

import Admin.Quiz_info;

public class Call 
{	
	public static void main(String[] args) throws Exception
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("If your User Please Enter (1) or If your Admin Please Enter (2)");
		System.out.println("1) User");
		System.out.println("2) Admin");
		int data = s.nextInt();
		switch(data)
		{
			case 1:
				Quiz_Signup.main(null);
				break;
				
			case 2:
				Quiz_info.main(null);
				break;
				
			default:
				System.out.println("Cannot Perform");
		}
	}
}