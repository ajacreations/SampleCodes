/*
 Write a java program that accepts a string and returns a new string without the first and last character
of the input string.

Example1)
i/p:Suman
o/p:uma
*/

public class Question5
{
	public static void main(String[] args) 
	{
		String str="Suman";
		System.out.println(str.substring(1,str.length()-1));
	}
}