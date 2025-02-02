
		import java.lang.*;
		import java.util.*;

		public class Largest_of_Three_Collection {

		    public static void main(String[] args)
		    {
		        System.out.println("Enter the numbers ");
				Scanner sc=new Scanner(System.in);
				int num1=sc.nextInt();
				int num2=sc.nextInt();
				int num3=sc.nextInt();
				
		        ArrayList<Integer> al = new ArrayList<Integer>();
		        al.add(num1);
		        al.add(num2);
		        al.add(num3);

		        System.out.println(Collections.max(al)   + " is the largest number.");
		       
		    }
		}
	
