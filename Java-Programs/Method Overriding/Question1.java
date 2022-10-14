/*
Create  a base class Fruit with name ,taste and size as its attributes. 

Create a method called eat() which describes the name of the fruit and its taste. 

Inherit the same in 2 other classes Apple and Orange and override the eat() method to represent each 
fruit taste.*/

class Fruit
{
	String name;
	String taste;
	double size;
	Fruit()
	{
		name="Fruit";
		taste="Sweet";
	}
	void eat()
	{
		System.out.println(name+" tastes "+taste);		
	}
}
class Apple extends Fruit
{
	void eat()
	{
		System.out.println("Apple tastes Sweet");
	}
}
class Orange extends Fruit
{
	void eat()
	{
		System.out.println("Orange tastes "+taste);
	}
}
class Question1
{
	public static void main(String[] args) 
	{
		Fruit f=new Fruit();
		Apple a=new Apple();
		Orange o=new Orange();
		f.eat();
		a.eat();
		o.eat();
	}
}