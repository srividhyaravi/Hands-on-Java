package Isainheritance;

public class Fourwheeler extends Client {
void insertfourwheelerdetails(String n,String f)

{
companyname=n;
fueltype=f;
}
void displaydetails1()
{
	System.out.println("Details of 4 wheeler");
System.out.println("Company name " +companyname);
System.out.println("fueltype " +fueltype);
}
}
