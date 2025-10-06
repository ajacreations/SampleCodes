/*
Create a class HashSetDemo with the folloing variables and methods:
HashSet set = new HashSet<>(); //instance variable
public static void main(String[] args)
boolean addCountry(String countryName)
String findCountry(String countryName)
void printAllCountries()
From main() method, try to add the county name to HashSet object by calling addCountry(). Provide duplicate 
country name while adding and observe the return values from the addCountry().
From main() method, try passing the country name to the findCountry() method and check the country name exists 
or not, if exists return the country name else return "Country Not Found".
Now, call printAllCountries() to print all the country names which are added earlier. (Try using Enumeration, 
Iterator, ListIterator and observe and also observe the order of elements being printed)
 */

import java.util.*;

class HashSetDemo
{
	HashSet set=new HashSet<>();
	public static void main(String[] args)
	{
		HashSetDemo h=new HashSetDemo();
		Scanner sc=new Scanner(System.in);
		String country;
		System.out.println("Enter country names: (Press ~ to stop)");
		country=sc.next();
		while(!country.equals("~"))
		{
			boolean b=h.addCountry(country);
			System.out.println("Result: "+b);
			country=sc.next();
		}
		System.out.print("Enter the country name You want to check:");
		String countryName=sc.next();
		System.out.println(h.findCountry(countryName));
		System.out.println("-----------------------------------------");
		System.out.println("Printing all countries");
		System.out.println("-----------------------------------------");
		h.printAllCountries();
	}
	boolean addCountry(String countryName)
	{
		try
		{
			boolean r=set.add(countryName);
			return r;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	String findCountry(String countryName)
	{
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
		{
			if(countryName.equals(itr.next()))
			{
				return countryName;
			}
		}
		return "Country Not Found";
	}
	void printAllCountries()
	{
		System.out.println(set);
		System.out.println("Printing via Iterator");
		printIterator(set);
	}

	//Printing via Iterator
	void printIterator(HashSet<String> list)
	{
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) 
			System.out.println(itr.next());
	}
	
}