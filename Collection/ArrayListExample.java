import java.io.*;
import java.util.*;
public class ArrayListExample {
    public static void main(String args[])
    {
        ArrayList al=new ArrayList(10);
        al.add(10);
        al.add(20);
        al.add(30);
        al.add("Chinmay");
        al.add(3,"Sai");
        Iterator itr=al.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println(al);
    
}
}
