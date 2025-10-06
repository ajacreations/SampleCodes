/*
Write a program to receive an integer number as a command line argument, and print the binary, octal and 
hexadecimal equivalent of the given number.

Sample Output:

java  Test 20
Given Number :20
Binary equivalent :10100
Octal equivalent :24
Hexadecimal equivalent :14
*/

public class Question2
{
	public static void main(String[] args) 
	{
		int number=Integer.parseInt(args[0]);
		System.out.println("Given Number :"+number);
		System.out.println("Binary equivalent :"+Integer.toBinaryString(number));
		System.out.println("Octal equivalent :"+Integer.toOctalString(number));
		String hex=	Integer.toHexString(number);
		System.out.println("Hexadecimal equivalent :"+hex.toUpperCase());
	}
}