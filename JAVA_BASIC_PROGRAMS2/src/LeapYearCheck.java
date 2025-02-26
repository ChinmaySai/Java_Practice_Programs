/** 
 * 
 * Java Program to Find if a Given Year is a Leap Year 
 */ 
 
import java.util.Scanner; 
 
public class LeapYearCheck { 
    public static void main(String[] args) { 
        System.out.println("Enter the year which you want to check if it is leap or not"); 
        Scanner sc=new Scanner(System.in); 
        int leapyear=sc.nextInt(); 
        boolean isLeap=false; 
        if(leapyear%400==0 ||((leapyear%4==0)&&(leapyear%100!=0))) 
        { 
            System.out.println("Year provided is Leap Year"); 
        } 
        else { 
            System.out.println("Year provided is not Leap Year"); 
        } 
    } 
} 
