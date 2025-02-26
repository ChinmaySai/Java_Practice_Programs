package com.conversion;
import java.util.Scanner; 
 
public class ConversionProgram { 
    public static void main(String[] args) { 
 
 
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the Binary "); 
        int binaryNum=sc.nextInt(2); 
        String number=String.valueOf(binaryNum); 
        System.out.println("Integer representation of "+number+" is "+Integer.toBinaryString(binaryNum)); 
        System.out.println(Integer.toOctalString(binaryNum)); 
        System.out.println(Integer.toHexString(binaryNum)); 
        String num1="F"; 
        String num2="10"; 
        System.out.println(Integer.parseInt(num1,16)); 
        System.out.println(Integer.parseInt(num2,8)); 
    } 
} 
 