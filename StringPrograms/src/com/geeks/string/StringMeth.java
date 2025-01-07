package com.geeks.string;

public class StringMeth {

	public static void main(String[] args) {
      String s=new String("Chinmay");
      
      //charAt()method
      char ch=s.charAt(0); 
      char ch1=s.charAt(4);
      //System.out.println(s.charAt(-1));//This will lead to StringIndexOutOfBoundsException.There is no negative indexing in java 
      //System.out.println(s.charAt(500));//This will lead to StringIndexOutOfBoundsException.
      System.out.println("ch :"+ch+"\nch1 :"+ch1);
      
      
      String sa="Sachin";
      System.out.println(sa.length());//6
      
      int a[]= {98,76};
      
      System.out.println(a.length);
      
	}

}

/*
 * length()---method of String Class
 * 
 * 
 * For Array length is property.
 * 
 * Below is class for Array and property for it.
 * 
 * class [I
 * {
 * 
 * int length;
 * 
 * }
 * 
 * 
 */
