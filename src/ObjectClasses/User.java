package ObjectClasses;
//toString()//
public class User {
	int var;
	String name;
	public User(String string) {
		// TODO Auto-generated constructor stub
		this.name=string;
	}
	void foo()
	{
		System.out.println("method");
	}
	//overidden//
	public String toString()
	{
	return "variable value is"+var;
			
	}
public int hashCode()
{
	return name.hashCode();
	
}
	public boolean equals(Object obj)
	{
		if(obj instanceof User)
		{
			//downcasting//
			User u= (User)obj;
			return this.name.equals(u.name);
		}
		else
		{
			return false;
		}
	}
	
}
