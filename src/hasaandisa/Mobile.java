package hasaandisa;

public class Mobile extends ElectronicDevices{
	
	void insertmobdetails(String name,int res, Motherboard m)
	{companyname=name;
	resolution=res;
	motherboard=m;
	}
	void displaydetails()
	{
System.out.println("details of mobile class");
System.out.println("company name is " + companyname);
System.out.println("resolution is " +resolution);
System.out.println("Motherboard is " +motherboard.motherboardmodel);
System.out.println("Motherboard model ram size is " + motherboard.ram.ramsize);
System.out.println("Motherboard model processorname is " +motherboard.processor.processorname);
System.out.println("Motherboard model processor speed is " + motherboard.processor.processorspeed);
System.out.println("Motherboard model processor type is " +motherboard.processor.typeofprocessor);
	}

}
