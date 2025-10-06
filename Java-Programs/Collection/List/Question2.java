/*
 Create an ArrayList that can store only numbers like int,float,double,etc, but not any other data type.
 */

import java.util.*;

class TypeNotMatchException extends Exception
{
	public TypeNotMatchException()
	{
		System.out.println("Only integer,float and double allowed");
	}
}
 class Arraylist<E> extends ArrayList<E>
 {
 	public boolean add(E e) 
 	{
 		if(e instanceof Integer || e instanceof Float || e instanceof Double)
 		{
 			super.add(e);
 			return true;
 		}
 		else
 		{
 			throw new ClassCastException();
 		}
 	}
 }
 class Question2
 {
 	public static void main(String[] args) 
 	{
 		List<Object> Arr=new Arraylist<>();
 		Arraylist a=new Arraylist();
 		try
 		{
 			Arr.add(12);
 			Arr.add(21.56f);
 			Arr.add(3.1412d);
 			Arr.add("i");
 		} 	
 		catch(ClassCastException e)
 		{ }
 		System.out.println(Arr);
 	} 
 }