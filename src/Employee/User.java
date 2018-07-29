package Employee;

public class User extends Person {
	User()
	{
		System.out.println("user class constructor");
	}
	User(int a)
	{
		super(10);
		System.out.println("Parameterized user constructor");
		
	}

}
