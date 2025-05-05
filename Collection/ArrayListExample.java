import java.io.*;
import java.util.*;
public class ArrayListExample {
    public static void main(String args[])
    {
        ArrayList al=new ArrayList(10);
        ArrayList al2=new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add("Chinmay");
        al.add(3,"Sai");
        al2.add("George");
        al2.add("Java");
        al2.add(2,"James Gosling");
        //The below line would result in Exception when adding the elements by index 
        //the index should be less than or equal to size of the list.size of arrayList is 3 
        //al2.add(4,"James ");
        al2.add(3,"Oracle");
        
        System.out.println("al2 -> "+al2);
        //Adding one list to Another list
        al.addAll(al2);
        Iterator itr=al.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
        System.out.println("\nal -> "+al);
        System.out.println("Element at index 0 "+al.get(0));
        al.set(0, 100);//updating the index 0th element with 100
        System.out.println(al);
        System.out.println("Size of Array List al "+al.size());
        System.out.println("Array List Contains 30 "+al.contains(30));
        System.out.println("Index of 30 "+al.indexOf(30));
        System.out.println("Last Index of 30 "+al.lastIndexOf(30));
        al.forEach(n->System.out.println(n));
        al.trimToSize(); //Reducing the Capacity of List to size of List
        System.out.println("al"+al);
        //al.removeAll(al2);
        al.retainAll(al2);
        System.out.println("al"+al);
        al.clear();//Clearing the Array List
        System.out.println("al "+al);
        //al.remove(100);
        //al.removeAll(al2)
        
}
}
