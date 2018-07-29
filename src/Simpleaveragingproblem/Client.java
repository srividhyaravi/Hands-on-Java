package Simpleaveragingproblem;
import java.util.Scanner;

public class Client {
	int sub1;
	int sub2;
	int sub3;
	int sub4;
	int sub5;
	int average=0;
	int total=0;
	
	public static void main(String[]args)
	
	{

		Client client=new Client();
		Average average=new Average();
		Scanner scanner=new Scanner(System.in);
		average.insertdetails();
		client.sub1=scanner.nextInt();
		client.sub2=scanner.nextInt();
		client.sub3=scanner.nextInt();
		client.sub4=scanner.nextInt();
		client.sub5=scanner.nextInt();
		client.total=client.total+client.sub1+client.sub2+client.sub3+client.sub4+client.sub5;
		System.out.println("total is " +client.total);
		client.average=client.total/5;
	System.out.println("average grade is "+client.average);
	
	
	int number;
	System.out.println("Enter the number of subjects");
	number = scanner.nextInt();
	int i;
	int totalmarks = 0;
	for(i=0;i<number;i++) {
		
		totalmarks  += scanner.nextInt();
		
	}
	
	
	
		

	}

}
