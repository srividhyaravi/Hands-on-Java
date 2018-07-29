package Activity1;
import java.util.*;

public class Client {
	String firstname;
	 String lastname;
	int age;
	int id;
public static void main(String[]args)
{
	int x;
	System.out.println("press 1: to enter student details,2: to enter employee details");
	Scanner scanner=new Scanner(System.in);
	x=scanner.nextInt();
	if(x==1)
	{
		System.out.println("you have chosen to enter student details");
		Student obj=new Student();
		obj.insertstudentdetails("Computer science");
		System.out.println("enter first name");
	obj.firstname= scanner.next();
		System.out.println("enter last name");
	obj.lastname=scanner.next();
		System.out.println("enter age");
		obj.age=scanner.nextInt();
		System.out.println("enter student id");
		obj.id=scanner.nextInt();
		obj.displaystudentdetails();
	}
			
	if(x==2)
	{System.out.println("you have chosen to enter employee details");
	Employee obj1=new Employee();
	System.out.println("enter salary");
	int salary= scanner.nextInt();
	System.out.println("enter department");
	String dept= scanner.next();

	
	System.out.println("enter designation");
	String designation= scanner.next();

	obj1.insertempldetails(salary, dept, designation);
	System.out.println("enter first name");
	obj1.firstname = scanner.next();
	System.out.println("enter last name");
	obj1.lastname=scanner.next();
	System.out.println("enter age");
	obj1.age=scanner.nextInt();
	System.out.println("enter employee id");
	obj1.id=scanner.nextInt();
	obj1.displayempdetails();
		
	}
	
}
}
