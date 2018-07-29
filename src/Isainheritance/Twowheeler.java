package Isainheritance;

public class Twowheeler extends Client {
	int fuel_volume=1000;
	
	void inserttwowheelerdetails(String name,String fuel)
	{
		companyname=name;
		fueltype=fuel;
	}
	
void start_bike(int volume)
{
	System.out.println("you've chosen to start the bike");
	System.out.println("Initial Volume " + fuel_volume);
	fuel_volume =1000 - volume;
	//System.out.println(fuel_volume);
}

void stop_bike() {
	System.out.println("you've chosen to stop the bike");
	System.out.println("Remaining fuel volume" + fuel_volume);

}
void displaydetails()
{
	System.out.println("Company name " +companyname);
	System.out.println("fueltype " +fueltype);

}
	
}
