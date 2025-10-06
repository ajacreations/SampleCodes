/*
1. Develop a java class with an instance variable mapObj  of type HashMap. 
Create a method String saveCountryCapital(String countryName, String capital) : The method should add the 
passed country and capital as key/value in the mapObj and return the appropriate value, try adding duplicate 
country name and capital.
Key- Country                          Value - Capital
India                                                      Delhi
Japan                                                    Tokyo
2. Develop a method String getCapital(String countryName) which returns the capital for the country passed. If 
country is not available, then return "No Country Found"
3. Develop a method String getCountry(String capitalName) which returns the country for the capital name. If 
capital is not available, then return "No Capital Found"
4. Develop a method which iterates through the mapObj and creates another HashMap mapObj2 with Capital as the 
key and value as Country and returns the mapObj2 object.
Key – Capital                    Value – Country
Delhi                                                  India
Tokyo                                                Japan
5. Develop a method which returns ArrayList object, the ArrayList object should contain all country names 
present in mapObj.
6. Develop a method which returns ArrayList object, the ArrayList object should contain all capital names 
present in mapObj.
NOTE: You can test the methods using a main method.
*/

import java.util.Map.*;
import java.util.*;


class Question1
{
	HashMap<String,String> mapObj=new HashMap<String,String>();
	//saveCountryCapital Funciton
	String saveCountryCapital(String countryName, String capital)
	{
		mapObj.put(countryName,capital);		
		return mapObj.get(countryName);
	}
	//Country is known.To find capital
	String getCapital(String countryName)
	{
		if(mapObj.containsKey(countryName))
		{
			return mapObj.get(countryName);
		}
		else
		{
			return "No Country Found";
		}
	}
	//Capital is known.To find country
	String getCountry(String capitalName)
	{
		if(mapObj.containsValue(capitalName))
		{
			Set<Entry<String, String>> set = mapObj.entrySet();
			Iterator<Entry<String, String>> itr = set.iterator();
			while (itr.hasNext()) 
			{
				Entry<String, String> e = itr.next();
			
				if (e.getValue().equals(capitalName))
					return e.getKey();
			}
		}
		return "No Capital Found";	
	}
	//change key into value and value into key
	public HashMap<String, String> swapKeyValue() 
	{
		HashMap<String, String> mapObj2 = new HashMap<String, String>();
		
		Set<Entry<String, String>> set = mapObj.entrySet();
		Iterator<Entry<String, String>> itr = set.iterator();
		
		while (itr.hasNext()) 
		{
			Entry<String, String> e = itr.next();
			mapObj2.put(e.getValue(), e.getKey());
		}
		
		return mapObj2;
	}
	//creating arraylist for countries
	public List<String> toArrayListCountry() 
	{
		List<String> keyList = new ArrayList<String>(mapObj.keySet());
		return keyList;
	}
	public List<String> toArrayListCapital()
	{  	
		List<String> valueList = new ArrayList<String>(mapObj.values());
		return valueList;
	}
	//Main Method.
	public static void main(String[] args) 
	{
		Question1 obj=new Question1();
		//Creating Country and Capital
		obj.saveCountryCapital("India","Delhi");
		obj.saveCountryCapital("Japan","Tokyo");
		obj.saveCountryCapital("Sri Lanka","Colombo");
		//Using getCapital Function.
		System.out.println("Capital of India: "+obj.getCapital("India"));
		System.out.println("Capital of Japan: "+obj.getCapital("Japan"));
	    System.out.println("Capital of Sri Lanka: "+obj.getCapital("Sri Lanka"));
	    //Using getCountry Function
	    System.out.println("Delhi is in "+obj.getCountry("Delhi"));
	    System.out.println("Tokyo is in "+obj.getCountry("Tokyo"));
	    System.out.println("Colombo is in "+obj.getCountry("Colombo"));	
	    //Printing arraylist
		System.out.println("Printing ArrayList Country");
		System.out.println(obj.toArrayListCountry());
		System.out.println("Printing ArrayList Capital");
		System.out.println(obj.toArrayListCapital());
	    //Swapping key and value
	    HashMap<String, String> mapObj2 = obj.swapKeyValue();
		System.out.println("After changing key and value:");
		System.out.println(mapObj2);
	}
}