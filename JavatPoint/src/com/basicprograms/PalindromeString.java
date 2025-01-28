package com.basicprograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeString {

	public static void main(String[] args) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the String which you want to check if it is Palindrome or not :");
		String input=br.readLine();
		StringBuilder rev=new StringBuilder();
		char revarr[]=input.toCharArray();
		for(int i=input.length()-1;i>=0;i--)
		{
			rev.append(revarr[i]);
		}
		String revString=rev.toString();
		if(revString.equals(input))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not a Palindrome");
		}
{
	
}
	}

}
