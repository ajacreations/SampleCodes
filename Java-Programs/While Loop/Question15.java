/*
Write a program to print * in Floyds format (using for and while loop)
*
*  *
*  *   *

Example1)
C:\>java Sample 
O/P: Please enter an integer number

Example2)
C:\>java Sample 3
O/P :
*
*  * 
*  *  *

*/
//Using While loop

public class Question15
{
	public static void main(String[] args) 
	{
		int num=Integer.parseInt(args[0]);
		int i=1;
		while(i<=num)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print("*\t");
				j++;
			}
			System.out.println();
			i++;
		}	
	}
}