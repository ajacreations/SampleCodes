/*
Write a program to initialize an integer array and find the maximum and minimum value of the array.
*/

public class Question2
{
	public static void main(String[] args) 
	{
		int[] arr={13,34,56,23,67,99,11};
		int len=arr.length;
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<len;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Maximum value= "+max);
		System.out.println("Minimum value= "+min);
	}
}