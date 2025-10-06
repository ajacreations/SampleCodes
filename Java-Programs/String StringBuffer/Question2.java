/*
Write a java program that will concatenate 2 strings and return the result. The result should be in 
lowercase.

Note:If the concatenation creates a double-char, then one of the characters need to be omitted.

Example1)
i/p:Sachin,Tendulkar
o/p:sachin tendulkar

Example2)
i/p:Mark,kate
o/p:markate
*/

public class Question2
{
	public static void main(String[] args) 
	{
		String str1="Mark";
		String str2="kate";
		String str3;
		if(str1.charAt(str1.length()-1)==str2.charAt(0))
		{
			str3=str1.concat(str2.substring(1,str2.length()));
		}
		else
		{
			str3=str1.concat(str2);	
		}
		System.out.println("Concatenated String is: "+str3.toLowerCase());
	}
}