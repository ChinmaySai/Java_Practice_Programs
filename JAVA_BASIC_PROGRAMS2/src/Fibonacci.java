import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		System.out.print("Enter number of elements for which you want series to be dispalyed :");
		Scanner sc=new Scanner(System.in);
		int number_Of_Elements=sc.nextInt();
		int val1=0,val2=1;
		if(number_Of_Elements==0)
		{
			System.out.print("No elements");
		}
		else if(number_Of_Elements==1)
		{
			System.out.print("0");
		}
		else if(number_Of_Elements==2)
		{
			System.out.print("0 1");
		}
		else
		{
			int val3=0;
			System.out.print("0 1 ");
			for(int i=3;i<=number_Of_Elements;i++)
			{
				val3=val1+val2;
			System.out.print(val3+" ");
			val1=val2;
			val2=val3;
			}
		}
	}

}
