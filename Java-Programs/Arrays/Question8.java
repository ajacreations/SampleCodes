/*
Write a program to print the sum of the elements of an array following the given below condition.

If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum.

Eg1) Array Elements - 10,3,6,1,2,7,9
O/P: 22   
[i.e 10+3+9]

Eg2) Array Elements - 7,1,2,3,6
O/P:19

Eg3) Array Elements - 1,6,4,7,9
O/P:10
*/

public class Question8
{
	public static void main(String[] args) 
	{
		int[] arr={1,6,4,7,9};
		int len=arr.length;
		int sum=0,i,j=-1,k=-1;
		for(i=0;i<len;i++)
		{
			if(arr[i]==6)
				j=i;
			if(arr[i]==7)
				k=i;
		}
		if(j<k)
		{
			for(i=0;i<len;i++)
			{
				if(i<j||i>k)
					sum+=arr[i];
			}
		}
		if((j==-1 && k==-1) || j>k)
		{
			for(i=0;i<len;i++)
				sum+=arr[i];
		}
		System.out.println(sum);
	}
}