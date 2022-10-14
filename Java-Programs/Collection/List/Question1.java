/*
 Create an ArrayList that can store only Strings. 
Create a printAll method that will print all the elements of the ArrayList using an Iterator and obeserve the 
order of the values being printed.
*/

import java.util.*;

public class Question1
{
	void printAll(ArrayList<String> str)
	{
		Iterator<String> itr=str.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	public static void main(String[] args) 
	{
		Question1 q=new Question1();
		ArrayList<String> strList=new ArrayList<String>();
		strList.add("Phone");
		strList.add("Tablet");
		strList.add("Laptop");
		strList.add("PC");
		q.printAll(strList);
	}
}