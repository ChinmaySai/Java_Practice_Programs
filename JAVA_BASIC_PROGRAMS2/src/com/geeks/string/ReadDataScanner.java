package com.geeks.string;
import java.util.Scanner;

public class ReadDataScanner {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String name="";
		System.out.print("Enter your name : ");
		name=sc.nextLine();
		int val=sc.nextInt();
		System.out.println("Welcome to world of Programming "+name);
	}

}
