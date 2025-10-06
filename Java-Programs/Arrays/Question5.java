/*
Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.
*/

public class Question5
{
	public static void main(String[] args) 
	{
		int[] arr={10,5,8,4,12,55,56,43,34,3};
		int len=arr.length,temp;
		for(int i=1;i<len;i++)
		{
			for(int j=1;j<len;j++)
			{
				if(arr[j-1]>arr[j])
				{
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}	
		}		
		System.out.println("Largest 2 numbers are "+arr[len-1]+" and "+arr[len-2]);
		System.out.println("Smallest 2 numbers are "+arr[0]+" and "+arr[1]);
	}
}