/*
Given 2 int arrays, a and b, each length 3, form a new array of length 2, containing their middle 
elements.

middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
*/

public class Question12
{
	public static void main(String[] args) 
	{
		int[] arr1={5,2,9};
		int[] arr2={1,4,5};
		int i;
		//In question it is given that bot arrays are off length 3
		System.out.print("middleWay([");
		for(i=0;i<3;i++)
		{
			if(i==2)
				System.out.print(arr1[i]);
			else
				System.out.print(arr1[i]+", ");
		}	
		System.out.print("], [");
		for(i=0;i<3;i++)
		{
			if(i==2)
				System.out.print(arr2[i]);
			else
				System.out.print(arr2[i]+", ");
		}	
		System.out.print("]) -> ["+arr1[1]+", "+arr2[1]+"]");
	}
}