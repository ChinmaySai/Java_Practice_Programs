import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		int tempnum=num;
		int palnum=0;
		
		while(num!=0)
		{
			int rem=num%10;
			num=num/10;
			palnum=palnum*10+rem;
		}
	
		if(palnum==tempnum)
		{
			System.out.println("Entered number is Palindrome");
		}
		else
		{
			System.out.println("Number is not Palindrome");
		}
	}
	

}
