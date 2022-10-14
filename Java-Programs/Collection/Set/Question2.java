/*
Create a Collection called TreeSet which is capable of storing String objects. Then try these following 
operations :
a) Reverse the elements of the Collection.
b) Iterate the elements of the TreeSet using Iterator and observe the order.
c) Check if a particular element exists or not.
*/

import java.util.*;

public class Question2
{
	static void print(Iterator<String> itr)
	{
		while(itr.hasNext())
		{
			Object ob=itr.next();
			System.out.println(ob);
		}
	}
	public static void main(String[] args) 
	{
		TreeSet<String> t=new TreeSet<String>();
		t.add("abc");
		t.add("def");
		t.add("ghi");
		t.add("jkl");
		t.add("mno");
		System.out.println("Contents of TreeSet before reversing:");	
		Iterator<String> itr=t.iterator();
		print(itr);
		System.out.println("Contents of TreeSet After reversing:");	
		Iterator<String> itr2=t.descendingIterator();
		print(itr2);
		System.out.println("Checking for \'abc\' in TreeSet");
		String str="abc";
		System.out.println(t.contains(str));
	}
}