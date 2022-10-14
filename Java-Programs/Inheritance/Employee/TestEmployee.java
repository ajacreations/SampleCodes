/*
Create a class called Person with a member variable name. Save it in a file called Person.java

Create a class called Employee that will inherit the Person class.The other data members of the 
Employee class are annual salary (double), the year the employee started to work, and the national 
insurance number which is a String.Save this in a file called Employee.java

Your class should have the necessary constructors and getter/setter methods.

Write another class called TestEmployee, containing a main method to fully test your class definition.
*/
//TestEmployee.java

class TestEmployee
{
	public static void main(String[] args) 
	{
		Employee obj=new Employee();
		obj.setName("Walter White");
		obj.setSalary(5000);
		obj.setYear(2004);
		obj.setInsureNo("2R51K9N8214");
		System.out.println("Name: "+obj.getName());
		System.out.println("Salary: "+obj.getSalary());
		System.out.println("year: "+obj.getYear());
		System.out.println("Insurance No: "+obj.getInsureNo());
	}
}