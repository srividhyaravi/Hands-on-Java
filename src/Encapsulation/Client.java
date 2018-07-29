package Encapsulation;

public class Client {
public static void main(String[]args)
{
	testencapsulation test=new testencapsulation();
	test.setPrivateVar(55);
System.out.println(test.getPrivateVar());
}
}
