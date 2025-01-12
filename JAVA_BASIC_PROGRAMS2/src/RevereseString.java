
import java.io.*;
import java.util.Scanner;

class ReverseString {
    public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        String input=sc.next();
        String rev="";
        char ch;

        for (int i = 0; i < rev.length(); i++) {
            rev = rev + input.charAt(i); 
        }
      
        System.out.println(rev);
    }
}