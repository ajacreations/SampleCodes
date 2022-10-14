/*
Write a Program to take care of Number Format Exception if user enters values other than integer for 
calculating average marks of 2 students. The name of the students and marks in 3 subjects are taken from the 
user while executing the program.
In the same Program write your own Exception classes to take care of Negative values and values out of range (
i.e. other than in the range of 0-100)
*/

import java.util.*;

class NegativeValuesException extends Exception
{
	public NegativeValuesException()
	{
		System.out.println("This is user defined exception.\nNegative value found.\nNegativeValuesException");
	}
}
class ValuesOutOfRangeException extends Exception
{
	public ValuesOutOfRangeException()
	{
		System.out.println("This is user defined exception.\nValues out of range found.\nValuesOutOfRangeException");	
	}
}
public class Question3
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String name;
		int[] marks=new int[3];
		for(int i=0;i<2;i++)
		{
			int sum=0;
			try
			{
				System.out.print("Enter the name of student :");
				name=sc.next();
				System.out.print("Enter his/her marks in 3 subjects:");
				for(int j=0;j<3;j++)
				{
					try
					{
						marks[j]=sc.nextInt();
						sum+=marks[j];
					}
					catch(InputMismatchException e)
					{
						System.out.println("Input Mismatch Exception");
						return;
					}
					catch(NumberFormatException e)
					{
						System.out.println("Number Format Exception");
						return;
					}
					if(marks[j]>100)
						throw new  ValuesOutOfRangeException();
					if(marks[j]<0)
						throw new NegativeValuesException(); 
				}
				System.out.println("Name : "+name);
				System.out.print("Marks in 3 Subjects :");
				for(int j=0;j<3;j++)
				{
					System.out.print(marks[j]+" ");
				}
				System.out.println("\nSum of marks : "+sum+"\n Average of marks : "+sum/3.0);
			}
			catch(NegativeValuesException e)
			{
				System.out.println(e.getMessage());
			}
			catch(ValuesOutOfRangeException e)
			{
				System.out.println(e.getMessage());
			}
		}	
	}
}