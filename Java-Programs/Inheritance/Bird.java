/*
Create a class named ‘Animal’ which includes methods like eat() and sleep().

Create a child class of Animal named ‘Bird’ and override the parent class methods. Add a new method 
named fly().

Create an instance of Animal class and invoke the eat and sleep methods using this object.

Create an instance of Bird class and invoke the eat, sleep and fly methods using this object.

*/

class Animal
{
	void eat()
	{
		System.out.println("Animal is Eating flesh");
	}
	void sleep()
	{
		System.out.println("Animal is Sleeping in the pit");
	}
}
class Bird extends Animal
{
	void eat()
	{
		System.out.println("Bird is Eating food");
	}
	void sleep()
	{
		System.out.println("Bird is Sleeping in the nest");
	}
	void fly()
	{
		System.out.println("Bird is Flying in the Sky");
	}
	public static void main(String[] args) 
	{
		Bird b=new Bird();
		b.eat();
		b.sleep();
		b.fly();	
	}
}