/*
Given two strings, a and b, print a new string which is made of the following combination-first character 
of a, the first character of b, second character of a, second character of b and so on. 
Any characters left, will go to the end of the result.

Example1)
i/p:Hello,World
o/p:HWeolrllod
*/

public class Question9
{
	public static void main(String[] args) 
	{
		String a="Sachin";
		String b="Tendulkar";
		StringBuffer obj=new StringBuffer();
		if(a.length()==b.length())
		{
			for(int i=0;i<a.length();i++)
			{
				obj.append(a.charAt(i)).append(b.charAt(i));
			}
			System.out.println(obj);
		}	
		else if(a.length()>b.length())
		{
			for(int i=0;i<b.length();i++)
			{
				obj.append(a.charAt(i)).append(b.charAt(i));
			}
			obj.append(a.substring(b.length(),a.length()));
			System.out.println(obj);
		}
		else
		{
			for(int i=0;i<a.length();i++)
			{
				obj.append(a.charAt(i)).append(b.charAt(i));
			}
			obj.append(b.substring(a.length(),b.length()));
			System.out.println(obj);
		}
	}
}