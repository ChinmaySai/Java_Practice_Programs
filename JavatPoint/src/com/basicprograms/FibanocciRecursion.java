package com.basicprograms;
import java.util.Scanner;

public class FibanocciRecursion {

	static int n1=0,n2=1,n3=0;
	public static void main(String[] args) {

		System.out.print("Enter number of elements for which you want series to be dispalyed : ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
	      if(num==0)
	      {
	    	  System.out.print("No elements");
	      }
	      else if(num==1)
	      {
	    	  System.out.print("0");
	      }
	      else if(num==2)
	      {
	    	  System.out.print("0 1");
	      }
	      else
	      {
	    	  System.out.print("0 1 ");
	    	  fib(num-2);
	      }
         
	}
	private static void fib(int n) {
		
		if(n>0)
		{
         n3=n1+n2;
         n1=n2;
         n2=n3;
         System.out.print(n3+" ");
         fib(--n);
		}
	}

}
