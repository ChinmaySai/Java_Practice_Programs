import java.util.Scanner;

public class LCM {

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
		int gc=0;
		if(num1>num2)
		{
             gc=gcd(num1,num2);	
            		 }
		else
		{
			gc=gcd(num2,num1);	
		}
		int lcm=(num1*num2)/gc;
		System.out.println("LCM of two numbers : "+lcm);
	}

}
