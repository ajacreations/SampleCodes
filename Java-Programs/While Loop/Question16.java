/*
 Write a program to reverse a given number and print

Example1)
I/P: 1234
O/P:4321

Example2)
I/P:1004
O/P:4001
*/

public class Question16
{
	public static void main(String[] args) 
	{
		int num=Integer.parseInt(args[0]);
		int sum=0,temp=num;
		while(num>0)
		{
			int rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}	
		System.out.println("The Reverse of "+temp+"is "+sum);
	}
}