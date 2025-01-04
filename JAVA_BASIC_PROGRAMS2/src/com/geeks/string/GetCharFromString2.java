package com.geeks.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Java Program to get the Specified character from the index in String.
class IndexNotInRangeException extends Exception
{
	public String toString()
	{
		return "Provided index is not with in the String length range";
		
	}
	public static void getCharindex(String input,int index) throws IndexNotInRangeException
	{
		if(input.length()>index)
		{
		System.out.println("Character at index "+index+" is " +input.charAt(index));
		}
		else
		{
			throw new IndexNotInRangeException();
		}
	}

}

public class GetCharFromString2 {

	public static void main(String[] args) throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Input String : ");
		String input=br.readLine();
		System.out.print("Enter the character index : ");
		int index=Integer.parseInt(br.readLine());
	      
		try
		{
			IndexNotInRangeException.getCharindex(input, index);
		//throw new IndexNotInRangeException();
		}
		catch(IndexNotInRangeException e)
		{
         System.out.println(e);
		}
		catch(Exception e1)
		{
	         System.out.println(e1);

		}
		
	}

}
