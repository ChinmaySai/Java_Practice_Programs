import java.sql.SQLOutput; 
import java.util.ArrayList; 
import java.util.Scanner; 
/** 
 * Java Program to Display All Prime Numbers from 1 to N 
 * 
 */ 
public class PrimeNumberList 
{ 

 
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the number :"); 
        int num=sc.nextInt(); 
        ArrayList<Integer> al=new ArrayList<>(); 
        int numberOfDivisors=0; 
        for(int i=2;i<=num;i++) 
        { 
            numberOfDivisors=0; 
            for(int j=1;i>=j;j++) 
            { 
                if(i%j==0) 
                { 
                    numberOfDivisors++; 
 
                } 
                if(numberOfDivisors>2) 
                    break; 
            } 
            if(numberOfDivisors==2) 
            { 
                al.add(i); 
            } 
        } 
        System.out.println("Prime numbers between 1 and "+num); 
        al.forEach(System.out::println); 
        //System.out.println("Hi"); 
        //Other way of Printing 
        System.out.println("Prime numbers between 1 and "+num); 
        for(Integer i:al) 
        { 
            System.out.println(i); 
        } 
    } 
} 

 