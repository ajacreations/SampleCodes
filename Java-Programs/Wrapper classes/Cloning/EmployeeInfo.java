/*
Create an employee class with properties of your choice. Create an object of this class and also create a 
clone of the same. After making the clone, change the properties of the original employee object and print 
the properties of both the original and clone object and note down your observation.
*/

class Employee implements Cloneable
{
	int EmpId;
	String EmpName;
	void setDetails(int EmpId,String EmpName)
	{
		this.EmpId=EmpId;
		this.EmpName=EmpName;
	}
	int getID()
	{
		return EmpId;
	}
	String getName()
	{
		return EmpName;
	}

	Employee doClone()
	{
		try
		{
			return (Employee) super.clone();
		}
		catch(CloneNotSupportedException e)
		{
			System.out.println("Cloning not allowed");
			return this;
		}
	}
}
class EmployeeInfo
{
	public static void main(String[] args) 
	{
		Employee emp1=new Employee();
		Employee emp2;
		emp1.setDetails(101,"Alan");
		//cloning
		emp2=emp1.doClone();
		System.out.println("\nBefore Changing Employee 1 details");
		System.out.println("Employee 1 ID: "+emp1.EmpId+"\tEmployee 1 Name: "+emp1.EmpName);
		System.out.println("Employee 2 ID: "+emp2.EmpId+"\tEmployee 2 Name: "+emp2.EmpName);
		//changing emp1 
		emp1.setDetails(102,"Ashwin");
		System.out.println("\nAfter Changing Employee 1 details");
		System.out.println("Employee 1 ID: "+emp1.EmpId+"\tEmployee 1 Name: "+emp1.EmpName);
		System.out.println("Employee 2 ID: "+emp2.EmpId+"\tEmployee 2 Name: "+emp2.EmpName);
	}
}