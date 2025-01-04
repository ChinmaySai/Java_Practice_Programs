package com.geeks.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Java Program to get the Specified character from the index in String.
class Getchar
{
	public static void getCharindex(String input,int index) throws Exception
	{
		if(input.length()>index)
		{
		System.out.println("Character at index "+index+" is " +input.charAt(index));
		}
		else
		{
			throw new Exception("Indexed Provided is not within in the String length");
		}
		
		
	}
}

public class GetCharFromString {

	public static void main(String[] args) throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Input String : ");
		String input=br.readLine();
		System.out.println("Enter the character index : ");
		int index=Integer.parseInt(br.readLine());
	      
		try
		{
		Getchar.getCharindex(input, index);
		}
		catch(Exception e)
		{
			System.out.println("Provided index is not with in the String length range");
		}
		
		
	}

}
