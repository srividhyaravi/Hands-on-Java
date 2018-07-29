package AbstractionInterface;

public class ConcreteClass implements InterfaceA,InterfaceB{
	public void addsome()
	{
		System.out.println("overidden");
	}
	void display()
	{
		System.out.println("concrete class method");
	}
	@Override
	public void addsome1() {
		System.out.println("method from interfaceB");
		
		
	}
	

}
