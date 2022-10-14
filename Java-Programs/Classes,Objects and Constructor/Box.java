/*
Create a class Box that uses a parameterized constructor to initialize the dimensions of a box.
The dimensions of the Box are width, height, depth. The class should have a method that can 
return the volume of the box. Create an object of the Box class and test the functionalities.
*/

public class Box
{
	double height,width,depth;
	Box(double height,double width,double depth)
	{
		this.height=height;
		this.width=width;
		this.depth=depth;
	}
	void getVolume()
	{
		System.out.println("Volume of the box is "+(height*width*depth));
	}
	public static void main(String[] args) 
	{
		Box b=new Box(4,5,6);
		b.getVolume();
	}
}