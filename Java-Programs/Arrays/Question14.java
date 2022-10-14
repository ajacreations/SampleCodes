/*
 Write a program to find the biggest number in a 3*3 array. The program is supposed to receive 9 
 integer numbers as command line arguments.

Example1:
C:\>java Sample 1 2 3
O/P: Please enter 9 integer numbers

Example2:
C:\>java Sample 1 23 45 55 121 222 56 77 89
O/P: 
The given array is :
1 23 45 
55 121 222 
56 77 89 
The biggest number in the given array is 222
*/

public class Question14
{
	public static void main(String[] args) 
	{
		int[][] arr=new int[3][3];
		int len=args.length;
		int[] arr2=new int[9];
		int i,j,k,max;
		if(len!=9)
		{
			System.out.println("Please enter 9 integer numbers");
			System.exit(0);
		}
		for(i=0;i<9;i++)
		{
			arr2[i]=Integer.parseInt(args[i]);
		}
		for(i=0,k=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				arr[i][j]=arr2[k];
				k++;
			}
		}
		System.out.println("The given array is:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		max=arr2[0];
		for(i=1;i<9;i++)
		{
			if(max<arr2[i])
				max=arr2[i];
		}
		System.out.println("\nThe biggest number in the given array is "+max);
	}
}