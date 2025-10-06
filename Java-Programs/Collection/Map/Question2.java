/*	
Create a contactList object of type TreeMap to store name (as Key) and phone number (as Value). The program 
should have the following abilities:
a) Provide contact name and get the phone number.
b) Provide phone number and get the contact name.
c) Print all the contact names and their respective phone numbers and observe the output
*/

import java.util.*;
import java.util.Map.*;

class Question2
{
	//For convenience phone number is conidered as String.
	TreeMap<String,String> contactList=new TreeMap<String,String>();
	void saveContactDetails(String name, String phoneNo)
	{
		contactList.put(name,phoneNo);		
	}
	String getNumber(String name)
	{
		if(contactList.containsKey(name))
		{
			return contactList.get(name);
		}
		else
		{
			return "No name found";
		}
	}
	String getName(String phoneNo)
	{
		if(contactList.containsValue(phoneNo))
		{
			Set<Entry<String, String>> set = contactList.entrySet();
			Iterator<Entry<String, String>> itr = set.iterator();
			while (itr.hasNext()) 
			{
				Entry<String, String> e = itr.next();
			
				if (e.getValue().equals(phoneNo))
					return e.getKey();
			}
		}
		return "No Phone number found";	
	}
	void printAll()
	{
		System.out.println(contactList);
	}
	public static void main(String[] args) 
	{
		Question2 obj=new Question2();
		obj.saveContactDetails("Arun","240256");
		obj.saveContactDetails("Arjun","240255");
		obj.saveContactDetails("Aron","240251");
		System.out.println("Searching the number 240250 :"+obj.getName("240250"));
		System.out.println("Searching the name Arjun : "+obj.getNumber("Arjun"));
		System.out.println("Printing all details");
		obj.printAll();
	}
}