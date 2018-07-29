package Randomnumbergenerator;
import java.util.Random;
// Import Random to display generate random numbers//
public class Client {
public static void main(String[]args)
{
	Random dice=new Random();
	for(int n=1;n<=10;n++)
	{
		System.out.println("generated numbers are:");
		// here we add 1 because when we use dice.nextint(6), it actually means the numbers 0-5. but since a dice has numbers1-6, we add 1//
		System.out.println(1+dice.nextInt(6));
	}

	
}
}
