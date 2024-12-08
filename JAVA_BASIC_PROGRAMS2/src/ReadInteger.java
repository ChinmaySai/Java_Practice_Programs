import java.io.*;
import java.util.Scanner;
public class ReadInteger {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an Integer : ");
		int a=0;
		if(sc.hasNextInt())
		{
		a=sc.nextInt();
		System.out.println("Entered Number is "+a);
		}
		else
		{
			System.out.println("Entered data is not Integer");
		}
	
		sc.close();
		
	}
}
