/*
Create a class called Person with a member variable name. Save it in a file called Person.java

Create a class called Employee that will inherit the Person class.The other data members of the 
Employee class are annual salary (double), the year the employee started to work, and the national 
insurance number which is a String.Save this in a file called Employee.java

Your class should have the necessary constructors and getter/setter methods.

Write another class called TestEmployee, containing a main method to fully test your class definition.
*/
//Employee.java

class Employee extends Person
{
	double salary;
	int year;
	String insur_no;
	void setSalary(double salary)
	{
		this.salary=salary;
	}
	double getSalary()
	{
		return salary;
	}
	void setYear(int year)
	{
		this.year=year;
	}
	int getYear()
	{
		return year;
	}
	void setInsureNo(String insur_no)
	{
		this.insur_no=insur_no;
	}
	String getInsureNo()
	{
		return insur_no;
	}
}
