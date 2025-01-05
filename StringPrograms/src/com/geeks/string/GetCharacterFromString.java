package com.geeks.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GetCharacterFromString {

	public static void main(String[] args) {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the input String :");
		try
		{
		String input=br.readLine();
		char a[]=new char[input.length()];
	     a=input.toCharArray();
	     System.out.println("Enter the index:");
	     int index=Integer.parseInt(br.readLine());
	     if(a.length>index)
	     {
	    	 System.out.println("Character at index "+index+" is "+a[index]);
	     }
	     else
	     {
	    	 System.out.println("Provided index with in the provided String Range");
	     }
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
