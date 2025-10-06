/*
Write a program to print prime numbers between 10 and 99.
*/

public class Question13
{
	public static void main(String[] args) 
	{
		int flag=0;
		for(int i=10;i<=99;i++)
		{
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=1;
				}
			}
			if(flag==0)
			{
				System.out.println(i+"\t");
			}
			flag=0;
		}	
	}
}