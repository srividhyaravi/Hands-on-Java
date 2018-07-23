package hasaandisa;
import java.util.*;
public class ElectronicDevices {
	String companyname;
	int resolution;
	Motherboard motherboard;
	
	public static void main(String[]args)
	
	{ int x;
		
		System.out.println("Choose your electronic device");
		System.out.println("Press 1 : for computer,2: for mobile ,3: to quit");
		Scanner scanner=new Scanner(System.in);
        x = scanner.nextInt();
		Processor processor=new Processor();
		Ram ram=new Ram();
		Motherboard motherboard=new Motherboard();

		if(x==1)
		{
			System.out.println("you have chosen to view the details of a computer");
			Computer computer=new Computer();
			processor.insertprocessordetails("intel", 250 ,"i5");
			ram.insertramdetails(8);
			motherboard.insertmotherboarddedtails(ram, processor ,"type6");
			computer.insertcompdetails("dell", 20, motherboard);
			computer.displaydetails();
			
		}
		if(x==2) {
			System.out.println("you have chosen to view the details of a mobile");
			Mobile mobile =new Mobile();
			mobile.insertmobdetails("Iphonex", 20, motherboard);
			processor.insertprocessordetails("intel", 250 ,"i5");
			ram.insertramdetails(8);
			motherboard.insertmotherboarddedtails(ram, processor ,"type6");
			//computer.insertcompdetails("dell", 20, motherboard);
			//computer.displaydetails();
			mobile.displaydetails();
			}
		if(x==3)
		{
			System.out.println("Quitting!");
		}
	
				
	}

}
