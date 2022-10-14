/*
 Write a Program to check whether a given String is Palindrome or not.
 */

 public class Question1
 {
 	public static void main(String[] args) 
 	{
 		String str="Lannister";	
 		String strRev;
 		System.out.println("String Before Reversing : "+str);
 		StringBuffer obj=new StringBuffer();
 		obj.append(str);
 		strRev=obj.reverse().toString();
 		System.out.println("String After Reversing : "+strRev);
 		if(str.equalsIgnoreCase(strRev))
 		{
 			System.out.println("String is Palindrome");
 		}
 		else
 		{
 			System.out.println("String is Not Palindrome");
 		}
 	}
 }