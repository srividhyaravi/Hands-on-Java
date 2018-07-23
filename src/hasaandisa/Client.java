package hasaandisa;

public class Client {
	public static void main(String[]args)
	{
		Computer computer=new Computer();
		Processor processor=new Processor();
		processor.insertprocessordetails("intel", 250 ,"i5");
		Ram ram=new Ram();
		ram.insertramdetails(8);
		Motherboard motherboard=new Motherboard();
		motherboard.insertmotherboarddedtails(ram, processor ,"type6");
		computer.insertcompdetails("dell", 20, motherboard);
		computer.displaydetails();
		Mobile mobile =new Mobile();
		mobile.insertmobdetails("Iphonex", 20, motherboard);
		mobile.displaydetails();
	}
	

}
