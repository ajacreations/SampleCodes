/*
 Write a program to receive a color code from the user (an Alphabhet). 

The program should then print the color name, based on the color code given. 

The following are the color codes and their corresponding color names.
R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White. 

If color code provided by the user is not valid then print "Invalid Code".
*/

import java.util.*;
public class Question8
{
	public static void main(String[] args)
	{
		System.out.println("Available Colour codes are R,B,G,O,Y,W");
		System.out.println("Choose Your Colour");
		char ch;
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		/* If command line argument is used then
		ch=args[0];
		is used. */
		switch(ch)
		{
			case 'R':System.out.println("Red");
						break;
			case 'B':System.out.println("Blue");
						break;
			case 'G':System.out.println("Green");
						break;
			case 'O':System.out.println("Orange");
						break;
			case 'Y':System.out.println("Yellow");
						break;
			case 'W':System.out.println("White");
						break;
			default:System.out.print("Invalid Code");
		}
	}
}