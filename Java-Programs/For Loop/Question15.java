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
//Using For loop

public class Question15
{
	public static void main(String[] args) 
	{
		int num=Integer.parseInt(args[0]);
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*\t");
			}
			System.out.println();
		}	
	}
}