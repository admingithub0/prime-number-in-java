// Java Program to Check Prime Number using For Loop
import java.util.Scanner;

public class PrimeNumber1 {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int i, number, count = 0; 
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number : ");
		number = sc.nextInt();		
		
		for (i = 2; i <= number/2; i++)
		{
			if(number % i == 0)
		    {
				count++;
		        break;
		    }	
		}
		if(count == 0 && number != 1 )
		{
			System.out.println( number + " is a Prime Number");
		}
		else
		{
		   System.out.println(number + " is Not a Prime Number");
		}
	}
}
