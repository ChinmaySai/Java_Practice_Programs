import java.util.Scanner; 
 
/** 
 * Java Program to Check Armstrong Number between Two Integers 
 */ 
public class ArmstrongCheckRange { 
    public static boolean armstrongCheck(int num) 
    { 
        int tempnum=num; 
        int sum=0; 
        String numlength=String.valueOf(num); 
        while(num!=0) 
        { 
            sum=sum+(int)Math.pow(num%10,numlength.length()); 
            num=num/10; 
        } 
        if(sum==tempnum) 
        { 
            return true; 
        } 
        else { 
            return false; 
        } 
    } 
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in); 
        int num1=sc.nextInt(); 
        int num2=sc.nextInt(); 
        while(num1<=num2) 
        { 
            //ArmstrongCheckRange.armstrongCheck(num1) 
            if(ArmstrongCheckRange.armstrongCheck(num1)) 
            { 
                System.out.println(num1); 
            } 
          num1++; 
        } 
    } 
} 
 