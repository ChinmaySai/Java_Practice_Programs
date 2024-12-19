import java.io.*;
import java.util.*;


public class EvenOdd {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the Number");
		int input=sc.nextInt();
		if(input%2==0)
		{
			System.out.println("Input Number is Even");
		}
		else
		{
			System.out.println("Input Number is Odd");
		}
		
	}

}
