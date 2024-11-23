package com.cjc.ims.app.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cjc.ims.app.model.Batch;
import com.cjc.ims.app.model.Course;
import com.cjc.ims.app.model.Faculty;
import com.cjc.ims.app.model.Student;
import com.cjc.ims.app.servicei.Cjc;

public class Karvenagar implements Cjc {
	
	Scanner sc = new Scanner(System.in);
	List<Course>clist= new ArrayList<>();
	List<Faculty>flist= new ArrayList<>();
	List<Batch>blist= new ArrayList<>();
	List<Student>slist=new ArrayList<>();
	
	@Override
	public void addCourse()
	{
		Course c = new Course();
		System.out.println("Enter Cid");
		c.setCid(sc.nextInt());
		System.out.println("Enter Course Name");
		c.setCname(sc.next()+sc.nextLine());
		
		clist.add(c);
	}
	@Override
	public void viewCourse()
	{
		System.out.println("    CID |  CNAME  ");
		 
			for(Course c : clist)
			{
				System.out.println("    "+c.getCid()+"   "+c.getCname());
			}
				
	}
	@Override
	public void addFaculty()
	{
		Faculty f = new Faculty();
	System.out.println("Enter Fid");
	
		f.setFid(sc.nextInt());
		
	System.out.println("Enter Fname");
	
		f.setFname(sc.next()+sc.nextLine());
		
	System.out.println("Assing Any One Course to Faculty Please Enter Cid");
	
		viewCourse();
		
		int cid=sc.nextInt();
		
		for(Course c : clist)
		{
			if(c.getCid()==cid)
			{
				f.setCourse(c);
				break;
			}else {
				
				System.out.println("Wrong Cid");
			}
		}
		
		flist.add(f);
		
	}
	
	@Override
	public void viewFaculty()
	{
		System.out.println("Fid  Fname  CourseName");
			for(Faculty f : flist)
			{
				System.out.println("  "+f.getFid()+"   "+f.getFname()+"   "+f.getCourse());
			}
	}
	
	@Override
	public void addBatch() {
	}
	Batch b = new Batch();
	{
		System.out.println("Enter Batch Bid");
		b.setBid(sc.nextInt());
		
		System.out.println("Enter Batch Name");
		b.setBname(sc.next()+sc.nextLine());
		
		System.out.println("Enter Faculty");
		viewFaculty();
		
		int fid=sc.nextInt();
		
		for(Faculty f : flist)
		{
			if(f.getFid()==fid)
			{
				b.setFaculty(f);
				break;
			}else {
				
				System.out.println("Wrong Faculty");
			}
		}
		
		blist.add(b);
		
	}
	
	@Override
	public void viewBatch() 
	{
		System.out.println(" Batch Id    Batch Nmae  FacultyName");
			for(Batch b : blist)
			{
				System.out.println("   "+b.getBid()+"   "+b.getBname()+"  "+b.getFaculty());
			}
	}
	
	@Override
	public void addStudent() 
	{
		Student s = new Student();
		System.out.println("Enter Student Id");
		 s.setSid(sc.nextInt());
		 
		System.out.println("Enter Student Name");
		s.setSname(sc.next()+sc.nextLine());
		
	System.out.println("Enter Batch Info");
	viewBatch();
	
	int bid = sc.nextInt();
	
	for(Batch b :blist)
	{
		if(b.getBid()==bid)
		{
			s.setBatch(b);
			break;
		}else {
			
			System.out.println("Wrong Batch");
		}
	}
	
	slist.add(s);
	
	}
	@Override
	public void viewStudent() 
	{
		System.out.println("Sid   SName   BatchName");
			
		for(Student s : slist)
	    System.out.println("    "+s.getSid()+"   "+s.getSname()+"  "+s.getBatch());
	}
		
}
