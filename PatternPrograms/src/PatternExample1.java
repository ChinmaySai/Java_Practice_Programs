import java.util.Scanner;

//Print Right Triangle Star Pattern
public class PatternExample1 {

	public static void main(String[] args) {

		System.out.println("Enter the height of the Pattern : ");
		Scanner sc=new Scanner(System.in);
		int height=sc.nextInt();
		for(int i=1;i<=height;i++)
		{
			for(int j=1;i>=j;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
