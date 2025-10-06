/*
Given an array of type int, print true if every element is 1 or 4. 

only14([1, 4, 1, 4]) → true
only14([1, 4, 2, 4]) → false
only14([1, 1]) → true
*/

public class Question11
{
	public static void main(String[] args) 
	{
		int[] arr={1,1,4,1,4};
		int len=arr.length;
		int flag=0,i;
		for(i=0;i<len;i++)
		{
			if(arr[i]!=1 && arr[i]!=4)
			{
				flag=1;
				break;
			}
		}
		System.out.print("only14([");
		for(i=0;i<len;i++)
		{
			if(i==len-1)
				System.out.print(arr[i]);
			else	
				System.out.print(arr[i]+", ");
		}
		System.out.print("]) -> ");
		if(flag==1)
			System.out.print("false");
		else
			System.out.print("true");
	}
}