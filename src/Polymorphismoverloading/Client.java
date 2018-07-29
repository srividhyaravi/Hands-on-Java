package Polymorphismoverloading;

public class Client {
public static void main(String[]args)
{
	ClassArea classarea=new ClassArea();
classarea.area(100);
int resultofrectangle=	classarea.area(100,200);
System.out.println("area of rect" +resultofrectangle);
int resultofcuboid=	classarea.area(200,100,50);
System.out.println("Area of cuboid" +resultofcuboid);
	}
}
