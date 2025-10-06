/*
Write a program to check if a given integer number is odd or even.
*/

public class Question2
{
	public static void main(String args[])
	{
		int num=Integer.parseInt(args[0]);
		if(num%2==0)
		{
			System.out.println(num+" is Even");
		}
		else
			System.out.println(num+" is odd");
	}
}