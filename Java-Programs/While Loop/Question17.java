/*
Write a Java program to find if the given number is palindrome or not

Example1)
C:\>java Sample 110011
O/P: 110011 is a palindrome

Example2)
C:\>java Sample 1234
O/P: 1234 is not a palindrome
*/

public class Question17
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
		if(temp==sum)
		{
			System.out.println(temp+" is Palindrome");
		}
		else
		{
			System.out.println(temp+" is not Palindrome");
		}
		
	}
}