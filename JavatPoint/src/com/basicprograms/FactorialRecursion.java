package com.basicprograms;

import java.util.Scanner;

public class FactorialRecursion {

	public static int incr=1,result=1;
	public static int fact(int n)
	{
		if(n==0)
		{
			return 1;
		}
        return n*fact(n-1);

	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();
		
		System.out.println("Facorial of "+num+" is "+FactorialRecursion.fact(num));
	}

}
