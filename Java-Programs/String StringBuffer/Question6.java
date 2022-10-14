/*
Given 2 strings, a and b, return a new string of the form short+long+short, with the shorter string on the
 outside and the longer string on the inside.

The strings will not be the same length, but they may be empty (length 0).

If input is "hi" and "hello", then output will be "hihellohi".
*/

public class Question6
{
	public static void main(String[] args) 
	{
		String str1="HI";
		String str2="hello";
		if(str1.length()>str2.length())
		{
			System.out.println(str2+str1+str2);
		}	
		else if(str1.length()==str2.length())
		{
			System.out.println("Try different lenght strings");
		}
		else
		{
			System.out.println(str1+str2+str1);
		}
	}
}