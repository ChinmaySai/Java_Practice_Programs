import java.io.*;
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		boolean isPrime=true;
		System.out.println("Enter the number to check if it is prime/not");
		int num=sc.nextInt();
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime)
		{
			System.out.println(num+" is  Prime number");

		}
		else
		{
			System.out.println(num+" is not Prime number");
		}
			
		
	}

}
