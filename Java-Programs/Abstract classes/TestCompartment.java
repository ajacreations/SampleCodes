/*
 Create an abstract class Compartment to represent a rail coach. Provide an abstract function notice in this 
 class. 

public abstract String notice();

Derive FirstClass, Ladies, General, Luggage classes from the compartment class. Override the notice function in
each of them to print notice message that is suitable to the specific type of  compartment.

Create a class TestCompartment.Write main function to do the following:
Declare an array of Compartment of size 10.
Create a compartment of a type as decided by a randomly generated integer in the range 1 to 4.
Check the polymorphic behavior of the notice method.
[i.e based on the random  number genererated, the first compartment can be Luggage, the second one could be
Ladies and so on..
*/

import java.util.*;	//For using Random

abstract class Compartment
{
	public abstract String notice();
}
class FirstClass extends Compartment
{
	public String notice()
	{
		return "First Class";
	}
}
class Ladies extends Compartment
{
	public String notice()
	{
		return "Ladies";
	}	
}
class General extends Compartment
{
	public String notice()
	{
		return "General";
	}	
}
class Luggage extends Compartment
{
	public String notice()
	{
		return "Luggage";
	}	
}
class TestCompartment
{
	public static void main(String[] args) 
	{
		Compartment[] c=new Compartment[10];
		Random r=new Random();
		for(int i=0;i<10;i++)
		{
			int num=r.nextInt(4-1)+1;
			switch(num)
			{
				case 1: c[i]=new Luggage();
						break;
				case 2: c[i]=new Ladies();
						break;
				case 3: c[i]=new FirstClass();
						break;
				case 4: c[i]=new General();
						break;
				default: break;
			}
			System.out.println(c[i].notice());
		}	
	}
}
