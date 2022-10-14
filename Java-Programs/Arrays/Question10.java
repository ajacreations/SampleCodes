/*
Print an array that contains the exact same numbers as the given array, but rearranged so that all 
the even numbers come before all the odd numbers. Other than that, the numbers can be in any order. 
You may modify and print the given array, or make a new array.

evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
evenOdd([3, 3, 2]) → [2, 3, 3]
evenOdd([2, 2, 2]) → [2, 2, 2]
*/

public class Question10
{
	public static void main(String[] args) 
	{
		int[] arr={3, 3, 2};
		int len=arr.length;
		int[] arr2=new int[len];
		int countE=0,countO=0;
		int i,j,k;
		for(i=0;i<len;i++)
		{
			if(arr[i]%2==0)
				countE++;
			else
				countO++;
		}
		int[] evenArr=new int[countE];
		int[] oddArr=new int[countO];
		for(i=0,j=0,k=0;i<len;i++)
		{
			if(arr[i]%2==0)
			{
				evenArr[j]=arr[i];
				j++;
			}
			else
			{
				oddArr[k]=arr[i];
				k++;
			}
		}
		for(i=0;i<countE;i++)
		{
			arr2[i]=evenArr[i];
		}
		for(j=0;j<countO;j++,i++)
		{
			arr2[i]=oddArr[j];
		}
		System.out.print("evenOdd([");
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