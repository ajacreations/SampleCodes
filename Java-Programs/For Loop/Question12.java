/*
Write a program to check if a given number is prime or not.
*/

public class Question12
{
	public static void main(String[] args) 
	{
		int num=Integer.parseInt(args[0]),flag=0;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag=1;
				break;
			}
		}	
		if(flag==1)
		{
			System.out.println(num+" is not a prime number");
		}
		else
		{
			System.out.println(num+" is prime number");
		}
	}
}