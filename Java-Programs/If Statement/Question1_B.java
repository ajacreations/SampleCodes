/*
B) Given two non-negative int values, print true if they have the same last digit, 
such as with 27 and 57.
*/

public class Question1_B
{
	public static void main(String args[])
	{
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		int rem1=num1%10;
		int rem2=num2%10;
		if(rem1==rem2)
		{
			System.out.println("lastDigit("+num1+","+num2+")->True");
		}
		else
		{
			System.out.println("lastDigit("+num1+","+num2+")->False");
		}

	}
}