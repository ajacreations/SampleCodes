/*
Initialize an integer array with ascii values and print the corresponding character values in a single 
row.
*/

public class Question4
{
	public static void main(String[] args) 
	{
		int[] ascii={65,98,90,121,42};
		int len=ascii.length;
		for(int i=0;i<len;i++)
		{
			char ch=(char)(ascii[i]);
			System.out.print(ch+"\t");
		}	
	}
}