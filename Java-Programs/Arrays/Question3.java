/*
Write a program to initialize an integer array with values and check if a given number is present in 
the array or not.

If the number is not found, it will print -1 else it will print the index value of the given  number 
in the array.

Example 1) If the Array elements are  {1,4,34,56,7} and the search element is 90, then the output 
expected is -1.

Example 2)If the Array elements are  {1,4,34,56,7} and the search element is 56, then the output 
expected is 3.
*/

public class Question3
{
	public static void main(String[] args) 
	{
		int[] arr={1,4,34,56,7};
		int len=arr.length;
		//here we get the search element as command line argument
		int num=Integer.parseInt(args[0]);
		int i;
		for(i=0;i<len;i++)
		{
			if(num==arr[i])
			{
				System.out.println(i);
				System.exit(0);
			}
		}	
		if(i==len)
		{
			System.out.println("-1");
		}
	}
}