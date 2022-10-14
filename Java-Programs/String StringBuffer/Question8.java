/*
Write a Java program that accepts a string (with * in it). The program should return a new string in which 
the following characters are removed-*,the characters that are to the left and right of *

Example1)
i/p:ab*cd
o/p:ad
*/

public class Question8
{
	public static void main(String[] args) 
	{
		String str="abk*rcd";
		int pos=str.indexOf('*');
		if(pos==-1)
		{
			System.out.println("Enter a string contains *");
		}
		else
		{
			StringBuffer obj=new StringBuffer();
			obj.append(str);
			System.out.println(obj.delete(pos-1,pos+2));
		}
	}
}