package ObjectClasses;

public class Client {
	public static void main(String[]args)
	{
//User user=new User();//
//System.out.println(user.toString());
		User user1=new User("abc");
		User user2=new User("abc");
		System.out.println(user1.getClass());
		System.out.println(user2.getClass());
		user1.foo();
		
		if(user1.equals(user2))
		{
			System.out.println("its equal");
		}
		else
		{
			System.out.println("not equal");
		}
		
	}

}
