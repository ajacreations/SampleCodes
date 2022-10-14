/*
 Write a program to reverse the elements of a given 2*2 array. Four integer numbers needs to be 
 passed as Command Line arguments.

Example1)
C:\>java Sample 1 2 3
O/P: Please enter 4 integer numbers

Example2)
C:\>java Sample 1 2 3 4
O/P: 
 The given array is :
  1 2 
  3 4 
 The reverse of the array is :
  4 3 
  2 1
  */

public class Question13
{
	public static void main(String[] args) 
	{
		int[][] arr=new int[2][2];
		int[][] revArr=new int[2][2];
		int len=args.length;
		int i,j,k=0;		
		if(len!=4)
		{
			System.out.println("Please enter 4 integer numbers");
			System.exit(0);
		}
		int[] arr2=new int[4];
		for(i=0;i<4;i++)
		{
			arr2[i]=Integer.parseInt(args[i]);
		}
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				arr[i][j]=arr2[k];
				k++;
			}
		}
		System.out.println("The Given Array is:");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("The Reverse of the array is:");
		for(i=0,k=3;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				revArr[i][j]=arr2[k];
				k--;
			}
		}
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(revArr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}

