/*
Write a program to print the sum of all the digits of a given number.

Example1) 
I/P:1234
O/P:10
*/

public class Question14
{
	public static void main(String args[])
	{
		int num=Integer.parseInt(args[0]);
		int temp=num;
		int sum=0;
		for(;num>0;)
		{
			int rem=num%10;
			sum+=rem;
			num=num/10;
		}
		System.out.println("Sum of digits of "+temp+" is "+sum);
	}
}