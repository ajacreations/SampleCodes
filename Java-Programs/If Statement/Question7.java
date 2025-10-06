/*
 Initialize a character variable with an alphabhet in a program.

If the character value is in lowercase, the output should be displayed in uppercase in the following format.

Example1)
i/p:a
o/p:a->A

If the character value is in uppercase, the output should be displayed in lowercase in the following format.

Example2)
i/p:A
o/p:A->
*/

public class Question7
{
	public static void main(String args[])
	{
		char ch='A';
		if((ch>=65)&&(ch<=80))
		{
			char ch1=Character.toLowerCase(ch);
			System.out.print(ch+"->"+ch1);
		}
		if((ch>=97)&&(ch<=122))
		{
			char ch1=Character.toUpperCase(ch);
			System.out.print(ch+"->"+ch1);
		}
	}
}