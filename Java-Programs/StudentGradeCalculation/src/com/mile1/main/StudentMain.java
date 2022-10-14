package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain 
{
	static Student data[]=new Student[4];
	StudentMain()
	{
		for(int i=0;i<data.length;i++)
		{
			data[i]=new Student();
		}
		data[0]=new Student("Sekar",new int[] {85,75,95});
		data[1]=new Student("Arun",null);
		data[2]=new Student(null,new int[] {45,55,44});
		data[3]=null;
	}
	public static void main(String args[]) throws NullPointerException
	{
		StudentService s1=new StudentService();
		StudentReport s2=new StudentReport();
		StudentMain s3=new StudentMain();
		String result=" ";
		for(int i=0;i<data.length;i++)
		{
			try
			{
				result=s2.validate(data[i]);
			}
			catch(Exception e) 
			{
				if(result==null)
					result="Not valid";
			}
			if(result.equals("VALID"))
			{
				String grade=s2.findGrades(data[i]);
				data[i].setGrade(grade);
				System.out.println("Student Name: "+data[i].getName());
				System.out.println("Student grade: "+data[i].getGrade());
			}			
		}
		System.out.println("Number of null marks: "+s1.findNumberOfNullMarksArray(data));
		System.out.println("Number of null names: "+s1.findNumberOfNullName(data));
		System.out.println("Number of null Objects: "+s1.findNumberOfNullObjects(data));
	}
}
