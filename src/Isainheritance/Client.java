package Isainheritance;
import java.util.*;

public class Client {
	//int fuel_volume;
String companyname;
String fueltype;
	
		public static void main(String[]args)
		{
			int x;
			System.out.println("Choose your vehicle");
			System.out.println("Press 1: to choose a two wheeler,2:to choose a four wheeler");
			Scanner scanner= new Scanner(System.in);
			x=scanner.nextInt();
			if(x==1)   // two wheeler 
			{
				System.out.println("you have selected a two wheeler");
				Twowheeler obj = new Twowheeler();
				obj.inserttwowheelerdetails("maruti", "diesel");
				obj.displaydetails();
				System.out.println("Press 1 : to choose bike,2: to choose scooty");
				x=scanner.nextInt();
				if(x==1)
				{
					System.out.println("You've chosen a bike");
					Twowheeler bike = new Twowheeler();			
					while(true) {
						System.out.println("Press 1 : to start bike,2: to stop bike, 3:quit");
						x=scanner.nextInt();
					if (x==3)
						break;
					
					//Bike bike = new Bike();
					if(x==1) {
						bike.start_bike(100);
						//bike.stop_bike();
					}
					
					else {
						//Twowheeler bike = new Twowheeler();
						bike.stop_bike();
						
					}

					} //end of while
				}
				if(x==2)
				{
					System.out.println("youve chosen a scooty");
					System.out.println("Press1: to start scooty,2: to stop scooty");
					Twowheeler scooty=new Twowheeler();
					x=scanner.nextInt();
					if(x==1)
					{System.out.println("you have chosen to start the scooty");
					}
					else
					{
						System.out.println("you have chosen to stop the scooty");
					}

					
					
				}
				}
			
			if(x==2)  // 4 wheeler
			{
				System.out.println("you have chosen a 4 wheeler");
				Fourwheeler obj1=new Fourwheeler();
				obj1.insertfourwheelerdetails("Suzuki", "Petrol");
				obj1.displaydetails1();
				System.out.println("Press 1: to select a car,2: to select a bus");
				x=scanner.nextInt();
				if(x==1)
				{
					System.out.println("you have chosen a car");
					System.out.println("press 1: to start the car,2: to stop the car");
					x=scanner.nextInt();
					if(x==1)
					{
						System.out.println("you have chosen to start the car");
						
					}
					else
					{
						System.out.println("you have chosen to stop the car");
					}
				}
				if(x==2)
				{					System.out.println("you have chosen a bus");
				
				System.out.println("press 1: to start the bus ,2: to stop the bus");
				x=scanner.nextInt();
					if(x==1)
					{						System.out.println("you have chosen to start the bus");

						
					}
					else
					{
						System.out.println("youve chosen to stop the bus");
					}
				}
			}
			
	}

}
