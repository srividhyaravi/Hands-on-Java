package hasa;

public class vehicle {
	 String engine;
	 String carbrand;
	 String color;
	 int noofwheels;
	 public vehicle(String enginecar,String brand,String color,int wheels)
	 {
		 engine=enginecar;
		 this.carbrand=brand;
		 this.color=color;
		 this.noofwheels=wheels;
	 }
	 void printdetails() {
		 System.out.println("engine " + engine);
		 System.out.println("brand " + carbrand);
		 System.out.println("no of wheels is " + noofwheels);
		 System.out.println("color is " +color);
		 
	 }
	 public static void main(String[]args)
	 {
		 engine eng=new engine(4,"diesel");
		 vehicle veh=new vehicle("eddxv","honda","black",4);
		veh.printdetails();
				 
				 
	 }

}
