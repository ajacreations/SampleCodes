/*
Write a class MathOperation which accepts 5 integers through command line. Create an array using these 
parameters. Loop through the array and obtain the sum and average of all the elements and display the result. 

Various exceptions that may arise like ArithmeticException, NumberFormatException, and so on should be handled.
*/

public class MathOperation
{
	public static void main(String[] args) 
	{
		int[] arr=new int[5];
		int sum=0;
		double avg;
		if(args.length>5)
		{
			System.out.println("Please enter only 5 integers");
			return;
		}
			try
			{
				for(int i=0;i<5;i++)
				{
					arr[i]=Integer.parseInt(args[i]);
					sum+=arr[i];
				}
				avg=(double)sum/5;
				System.out.println("Sum="+sum+"\tAverage="+avg);
			}
			catch(ArithmeticException e)
			{
				System.out.println("ArithmeticException");
			}
			catch(NumberFormatException e)
			{
				System.out.println("NumberFormatException");	
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("ArrayIndexOutOfBoundsException");					
			}
	}
}