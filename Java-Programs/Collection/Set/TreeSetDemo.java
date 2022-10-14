/*
 Create the below classes:
class Employee{
int empID;
String name;
float salary;
}
class TreeSetDemo{
 public static void main(String[] args)
 boolean addEmployee(Employee emp)
 void displayAllEmployees() // Display employee details based on salary in ascending order
}
*/

import java.util.*;
class Employee implements Comparable
{
	int empID;
	String name;
	float salary;
	Employee(int empID,String name,float salary)
	{
		this.empID=empID;
		this.name=name;
		this.salary=salary;
	}
	public int compareTo(Object obj)
	{
		Employee emp=(Employee) obj;
		if(salary==emp.salary)
		{
			return 0;
		}
		else if(salary>emp.salary)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
class TreeSetDemo
{
	TreeSet<Employee>  t=new TreeSet<Employee>();
	boolean addEmployee(Employee emp)
	{
		boolean b=t.add(emp);
		return b;
	}
	void displayAllEmployees()
	{
		Iterator itr=t.iterator();
		while(itr.hasNext())
		{
			Employee e=(Employee) itr.next();
			System.out.println(e.empID+":"+e.name+":"+e.salary);
		}
	}
	public static void main(String[] args) 
	{
		TreeSetDemo obj=new TreeSetDemo();
		Employee emp1=new Employee(101,"Mahi",35000);
		Employee emp2=new Employee(102,"Paaji",25000);
		Employee emp3=new Employee(103,"Viru",20000);
		Employee emp4=new Employee(104,"Yuvi",15000);
		boolean b1=obj.addEmployee(emp1);
		boolean b2=obj.addEmployee(emp2);
		boolean b3=obj.addEmployee(emp3);
		boolean b4=obj.addEmployee(emp4);
		obj.displayAllEmployees();
	}
}
