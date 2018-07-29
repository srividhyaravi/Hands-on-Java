package Activity1;


public class Employee extends Client
{
int salary;
String deptname;
String designation;
void insertempldetails(int salary,String deptname,String designation)

{
	
	this.salary=salary;
	this.deptname=deptname;
	this.designation=designation;
	
	
		
	
}
void displayempdetails()
{
	System.out.println("Details of Employee"); 
	System.out.println("Employee's first name :" +firstname);
	System.out.println("Employee's last name: " +lastname );
	System.out.println("Employee's age :" +age);
	System.out.println("Employee's salary " +salary);
	System.out.println("Employee's department name : " +deptname);
	System.out.println("Employee's designation:" +designation);
	System.out.println("Employee's id: " +id);
	


}
}