package CompoundInterest;
//formula to calculate compound interest:amount=principal(1+rate)^n, where n is the no of days or years//
public class Client {
	
	
public static void main(String[]args)
{double amount;
double principal=1000;
double rate=0.01;
double n;
	for(n=1;n<=10;n++)
	{
		// USE MATH.POW TO MULTIPLY DIFFERENT TERMS
		amount= principal*Math.pow(1+rate,n);
		
		System.out.println("amount is" +amount);
		
	}
}
}
