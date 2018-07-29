package PFpercentage;
import java.util.*;
public class Client {
	 int id;
	 String name;
	 float salary;
	 float netsalary;
	float pfpercentage;
	public static void main(String[]args)
	{
		Client obj = new Client();
		Employee obj1=new Employee();
		System.out.println(" details of employee");
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter id :");
		obj.id = scanner.nextInt();
		System.out.println("enter name :" );
		obj.name=scanner.next();
		System.out.println("enter salary :");
		obj.salary=scanner.nextFloat();
		System.out.println("enter pf percentage (in multiples of 0.01) :" );
		obj.pfpercentage=scanner.nextFloat();
		obj1.setId(obj.id);	
		obj1.setName(obj.name);
		obj1.setSalary(obj.salary);
		obj1.setpfpercentage(obj.pfpercentage);
		obj1.calculatenetsalary(obj.pfpercentage);
		obj1.displaytdetails();
		
		
		
		
	
		
	
		
		}
	

}
