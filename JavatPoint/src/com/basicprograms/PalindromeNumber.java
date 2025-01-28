package com.basicprograms;

import java.util.Scanner;

/**
 * Java Program to Check if the number is Palindrome /not
 */
public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number to check if it is palindrome or not : ");
        int n=sc.nextInt();
        int temp=n,rev=0;
        boolean isPal=true;
        if(n<0)
        {
          System.out.println("Not a Palindrome");
        }
        else
        {
        while(n!=0)
        {
            rev=rev*10+n%10;
            n=n/10;
        }

         if(temp==rev)
         {
        	 System.out.println("Palindrome");
         }
         else
         {
        	 System.out.println("Not a Palindrome");
         }
        }
        
	}

}
