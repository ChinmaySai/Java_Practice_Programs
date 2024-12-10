import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number to check");
		int num_check=scn.nextInt();
		
		for(int i=2;i<=num_check/2;i++)
		{
			if(num_check%i==0)
			{
				System.out.println("Not a Prime");
				return ;
			}
		}
		System.out.println("Prime Number");
	}

}
