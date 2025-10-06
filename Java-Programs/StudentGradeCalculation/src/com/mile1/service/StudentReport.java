package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;

public class StudentReport 
{
	public String findGrades(Student studentObject)
	{
		int[] marks=studentObject.getMarks();
		int sum=0;
		for(int i=0;i<marks.length;i++)
		{
			if(marks[i]<35)
			{
				return "F"; //If any of mark is less than 35 ,the grade is F.
			}
			sum+=marks[i];
		}
		if(sum<110)
		{
			return "D";
		}
		else if(sum<150)
		{
			return "C";
		}
		else if(sum<200)
		{
			return "B";
		}
		else if(sum<250)
		{
			return "A";
		}
		else
		{
			return "A+";
		}
		
	}
	public boolean isValid(Student s)
	{
		return (s!=null)?true:false;
	}
	public String validate(Student s) 
	{
			try
			{
				boolean b=isValid(s);
				if(b==false) 
				{
					throw new NullStudentObjectException();
				}
				else
				{
					String name=s.getName();
					if(name==null)
					{
						throw new NullNameException();					
					}
					else if(s.getMarks()==null)
					{
						throw new NullMarksArrayException();
					}
					else
					{
						return "VALID";
					}
				}
			}
			  catch(NullStudentObjectException e)
			{
			  e.printStackTrace(); 
			  return "Not Valid"; 
			} 
			catch(NullNameException e)
			{
				e.printStackTrace();
				return "Not Valid";
			}
			catch(NullMarksArrayException e)
			{
				e.printStackTrace();
				return "Not Valid";
			}
			//return "Not Valid";
	}
}
