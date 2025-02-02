import java.util.Scanner;

public class GCD {

	public static int gcd(int a,int b)
	{
		if(b==0)
			return a;
		 return gcd(b,a%b);
		
	}
	public static void main(String[] args) {
		System.out.println("Enter the two number for which you want to find the GCD : ");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		if(num1>num2)
		{
			System.out.println("GCD : "+gcd(num1,num2));
		}
		else
		{
			System.out.println("GCD : "+gcd(num2,num1));	
		}
			

	}

}
