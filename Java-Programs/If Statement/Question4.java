/*
Initialize two character variables in a program and displaythe characters in alphabetical
order.

Example1) if the first character is 's' and second character is 'e' then the output should 
be  e,s

Example2) if the first character is 'a' and second character is 'e', then the output should 
be a,e
*/

public class Question4
{
	public static void main(String args[])
	{
		char ch1='b';
		char ch2='k';
		if(ch1>ch2)
		{
			System.out.println(ch2+","+ch1);
		}
		else
		{
			System.out.println(ch1+","+ch2);
		}
	}
}