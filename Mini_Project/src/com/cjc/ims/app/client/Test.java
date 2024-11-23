package com.cjc.ims.app.client;

import java.util.Scanner;

import com.cjc.ims.app.servicei.Cjc;
import com.cjc.ims.app.serviceimpl.Karvenagar;

public class Test {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		Cjc cjc = new Karvenagar();
		
		while(true)
		{
			System.out.println("1.Add Course");
			System.out.println("2.View Course");
			System.out.println("3.Add Faculty");
			System.out.println("4.View Faculty");
			System.out.println("5.Add Batch");
			System.out.println("6.View Batch");
			System.out.println("7.Add Student");
			System.out.println("8.View Student");
			System.out.println("Enter your Choice");
			
				int ch=sc.nextInt();
					
				switch(ch)
				{
				
				case 1:
						cjc.addCourse();
						break;
				
				case 2:
						cjc.viewCourse();
						break;
						
				case 3:
						cjc.addFaculty();
						break;
						
				case 4:
						cjc.viewFaculty();
						break;
						
				case 5:
						cjc.addBatch();
						break;
			
				case 6:
						cjc.viewBatch();
						break;
					
				case 7:
						cjc.addStudent();
						break;
					
				case 8:
						cjc.viewStudent();
						break;
				default :
						System.out.println("Something Wrong");
				}
			
		}
		
		
	}

}
