/*
Write a program to initialize an integer array and print the sum and average of the array.
*/

public class Question1
{
	public static void main(String[] args) 
	{
		int[] arr={10,12,34,25,19};
		int sum=0;
		int len=arr.length;
		for(int i=0;i<len;i++)
		{
			sum+=arr[i];
		}	
		System.out.println("Sum of the array= "+sum);
		System.out.println("Average of the array= "+(sum/len));
	}
}