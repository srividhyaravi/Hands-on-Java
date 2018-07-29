package Static;

public class TestStatic {
int count;
	static
	{
		System.out.println(" Static block 1");
	}
 void increment()
	{
	
		
		count++;
		System.out.println("Count is " +count);
		
	}
	void foo()
	{
	
		System.out.println("non static method");
		
	}
	static
	{
		System.out.println("Static block 2");
	}
	

}
