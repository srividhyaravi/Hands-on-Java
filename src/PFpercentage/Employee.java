package PFpercentage;

public class Employee extends Client {
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public float getNetsalary() {
		return netsalary;
	}
	public void setpfpercentage(float pfpercentage) {
		this.pfpercentage = pfpercentage;
	}
	public void calculatenetsalary(float pfpercentage)
	{

		netsalary=salary-(salary*pfpercentage);
		
	}
	void displaytdetails()
	{
		System.out.println("id :" +id);
		System.out.println(" name :" +name);
		System.out.println(" salary :" +salary);
		System.out.println(" pf percentage :" +pfpercentage);
		System.out.println(" net salary :" +netsalary);

	}
	

}
