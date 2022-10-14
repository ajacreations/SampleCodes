/*
 Create a new class called Calculator with the following methods: 
1. A static method called powerInt(int num1,int num2)
This method should return num1 to the power num2.
2. A static method called powerDouble(double num1,int num2).
This method should return num1 to the power num2.
3. Invoke both the methods and test the functionalities.
Hint: Use Math.pow(double,double) to calculate the power.
*/

public class Calculator
{
	static double powerInt(int num1,int num2)  		//Math.pow returns a double value
	{
		return Math.pow(num1,num2);
	}
	static double powerDouble(double num1,double num2)
	{
		return Math.pow(num1,num2);
	}
	public static void main(String[] args) 
	{
		Calculator c=new Calculator();
		System.out.println("method powerInt ");
		double volInt=c.powerInt(15,2);
		System.out.println("Volume="+volInt);
		System.out.println("method powerDouble ");
		double volDouble=c.powerDouble(8.0,2.0);
		System.out.println("Volume="+volDouble);
	}
}