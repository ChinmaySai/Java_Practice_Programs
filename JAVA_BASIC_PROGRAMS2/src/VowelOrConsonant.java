import java.util.ArrayList; 
import java.util.HashSet; 
 
public class VowelOrConsonant { 
    public static void main(String[] args) { 
        //System.out.println(""); 
        String str="abcdefghijklmnopqrstuvwxyz"; 
        ArrayList<Character> vowelList=new ArrayList<>(); 
        ArrayList<Character> consonantList=new ArrayList<>(); 
 
        for(int i=0;i<str.length();i++) 
        { 
            char ch=str.charAt(i); 
            if(ch=='i'||ch=='a'||ch=='e'||ch=='o'||ch=='u') 
            { 
                vowelList.add(ch); 
            } 
            else 
            { 
                consonantList.add(ch); 
            } 
        } 
        System.out.print("Vowel List "+vowelList); 
        System.out.print("\nConsonant List  "+consonantList); 
 
 
    } 
} 
 