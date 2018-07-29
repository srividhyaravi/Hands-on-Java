package Employee;

public class EmployeeClass extends User {
private int empid;
private String empname;
EmployeeClass()
{
System.out.println("Default constructor");
}
EmployeeClass(int id, String name)
{ super(20);
	this.empid=id;
	this.empname=name;
	System.out.println("Parameterized constructor of Employee");
}
}
