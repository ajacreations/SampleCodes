/*
Print a version of the given array where all the 10's have been removed. The remaining elements 
should shift left towards the start of the array as needed, and the empty spaces at the end of the 
array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and display the given 
array or make a new array.

withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
withoutTen([10, 2, 10]) → [2, 0, 0]
withoutTen([1, 99, 10]) → [1, 99, 0]
*/

public class Question9
{
	public static void main(String[] args) 
	{
		int[] arr={1, 99, 10};
		int len=arr.length;
		int[] arr2=new int[len];
		int i,j,temp,count=0;
		for(i=0;i<len;i++)
		{
			if(arr[i]==10)
				count++;
		}
		for(i=0,j=0;i<len;i++)
		{
			if(arr[i]!=10)
			{
				arr2[j]=arr[i];
				j++;
			}
		}
		for(i=1;i<=count;i++)
		{
			arr2[j]=0;
			j++;
		}
		System.out.print("withoutTen([");
		for(i=0;i<len;i++)
		{
			if(i==len-1)
				System.out.print(arr[i]);
			else
				System.out.print(arr[i]+", ");
		}
		System.out.print("]) -> [");
		for(i=0;i<len;i++)
		{
			if(i==len-1)
				System.out.print(arr2[i]);
			else
				System.out.print(arr2[i]+", ");
		}
		System.out.print("]");
	}
}