/*
Write a program to store integer numbers into Vector collection and use Enumeration to print the values. Also 
try using Iterator and ListIterator to print the values from the Vector object.
*/

import java.util.*;

class Question3
{
	//Printing via enumeration
	void printEnum(Vector<Integer> list)
	{
		Enumeration enm =  list.elements();
		while(enm.hasMoreElements())
		{
			System.out.println(enm.nextElement());
		}
	}
	//Printing via Iterator
	void printIterator(Vector<Integer> list)
	{
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) 
			System.out.println(itr.next());
	}
	//Printing via ListIterator
	void printListIterator(Vector<Integer> list)
	{
		ListIterator listItr=list.listIterator();
		while(listItr.hasNext())
		{
			System.out.println(listItr.next());
		}
	}

	public static void main(String[] args) 
	{
		Vector<Integer> list = new Vector<>();
		Question3 q=new Question3();
		list.add(100);
		list.add(200);
		list.add(300);
		System.out.println("Printing via enumerator:");
		q.printEnum(list);
		System.out.println("Printing via Iterator:");
		q.printIterator(list);
		System.out.println("Printing via ListIterator:");
		q.printListIterator(list);
	}
}