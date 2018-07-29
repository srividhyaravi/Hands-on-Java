package Polymorphismoverloading;

public class ClassArea {
void area(int length)
{
	System.out.println("Area of square is" +length*length);
}
int area(int length,int breadth)
{
	return length*breadth;
}
int area(int length,int breadth,int height)
{
	return length*breadth*height;
}
}