/*
Write a program to remove the duplicate elements in an array and print the same.
Example)
I/P:{12,34,12,45,67,89}
O/P:{12,34,45,67,89}
*/

public class Question7
{
	public static void main(String[] args) 
	{
		int[] arr={12,34,12,45,67,89};
		int len=arr.length;
		int i,j;
		for(i=0;i<len;i++)
		{
			for(j=0;j<i;j++)
			{
				if(arr[i]==arr[j])
				{
					break;
				}
			}	
			if(i==j)
				System.out.print(arr[i]+"\t");
		}
	}
}