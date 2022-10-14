/*
Given a string and an integer n, print a new string made of n repetitions of the last n characters of the 
string. 
You may assume that n is between 0 and the length of the string, inclusive. 

Example1)
i/p:James,3
o/p:mesmesmes
*/

public class Question10
{
	public static void main(String[] args) 
	{
		String str="James";
		int n=3;
		if(n<0 || n>str.length()-1)
		{
			System.out.println("n must between 0 and the length of the string, inclusive.");
		}
		else
		{
			for(int i=0;i<n;i++)
			{
				System.out.print(str.substring(str.length()-n,str.length()));
			}
		}
	}
}