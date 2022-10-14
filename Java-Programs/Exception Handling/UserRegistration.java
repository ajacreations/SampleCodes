/*
 A student portal provides user to register their profile. During registration the system needs to validate the
user should be located in India. If not the system should throw an exception.

Step 1: Create a user defined exception class named InvalidCountryException.
Step 2: Overload the respective constructors.
Step 3: Create a main class UserRegistration, add the following method,
void registerUser(String username,String userCountry) with the below implementation
• if userCountry is not equal to  India throw a InvalidCountryException with the message User Outside India  
cannot be registered
• if userCountry is equal to  India,  print the message User registration done successfully

Invoke the method registerUser from the main method with the data specified and see how the program behaves.
Example1)
i/p:Mickey,US 
o/p:InvalidCountryException should be thrown.
The message should be User Outside India  cannot be registered

Example2)
i/p:Mini,India
o/p:User registration done successfully
Exception Handling: User Defined Exception & throw
*/

import java.util.*;

class InvalidCountryException extends Exception
{
	public InvalidCountryException()
	{
		System.out.println("User Outside India  cannot be registered");
	}
}
public class UserRegistration
{
	void registerUser(String username,String userCountry) throws InvalidCountryException
	{
		if(!"India".equalsIgnoreCase(userCountry))
			throw new InvalidCountryException();
		else
			System.out.println("User registration done successfully.");
	}
	public static void main(String[] args) 
	{
		UserRegistration ur=new UserRegistration();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter user name : ");
		String name=sc.next();
		System.out.print("Enter user country: ");
		String country=sc.next();
		try
		{
			ur.registerUser(name,country);
		}
		catch(InvalidCountryException e)
		{
		}
	}
}