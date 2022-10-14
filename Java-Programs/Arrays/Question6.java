/*
Write a program to initialize an array and print them in a sorted order.
*/

public class Question6
{
	public static void main(String[] args) 
	{
		int[] arr={17,23,32,12,34,15,16,18,10};
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
		for(int i=0;i<len;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}
}				