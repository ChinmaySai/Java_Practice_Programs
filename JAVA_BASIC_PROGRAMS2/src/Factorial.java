import java.util.Scanner;

/**
 * Java Program to find the Factorial of a number
 */
public class Factorial {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
        int num=sc.nextInt();
        long fact=1l;
        for(int i=1;i<=num;i++)
        {
        	fact=fact*i;
        }
        System.out.println("Factorial of "+num+" is "+fact);
	
	}

}
