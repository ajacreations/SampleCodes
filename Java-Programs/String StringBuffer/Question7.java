/*
Given a string, if the first or last chars are 'x', return the string without those 'x' chars, otherwise
return the string unchanged. 

If the input is "xHix", then output is "Hi".
If the input is "America", then the output is "America".
*/

public class Question7
{
	public static void main(String[] args) 
	{
		String str="America";
		if(str.charAt(0)=='x')
		{
			if(str.charAt(str.length()-1)=='x') 	//First OR last in Question
			{
				System.out.println(str.substring(1,str.length()-1));
			}
			else
			{
				System.out.println(str.substring(1,str.length()));
			}
		}
		else if(str.charAt(str.length()-1)=='x')
		{
			System.out.println(str.substring(0,str.length()-1));
		}
		else
		{
			System.out.println(str);
		}
	}
}