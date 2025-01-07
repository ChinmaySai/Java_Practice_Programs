public class StringMethod2 {

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
      //https://onlinegdb.com/yNbbyngkW
      String s1="SachinIndMI";
      System.out.println(s1.substring(9));//MI
      System.out.println(s1.substring(0,9));//SachinInd
      
      
      //replace method:
      String s4="Sbchin";
     String new_Data=s4.replace('b','a');/*A new Object will be created for the newdata and we made it pointed by new_Data reference
                                           If we don't create a new reference for it there will be no reference mapped for that new Object
                                           s4 will be pointing to "Sbchin" only */
      System.out.println(new_Data);
      
      System.out.println("\n Lower Case and Upper Case ");
      String case1="SaChIN";
      System.out.println(case1.toUpperCase());//SACHIN --New Objects will be created
      System.out.println(case1.toLowerCase());//sachin
      
      System.out.println("\n Trim Method");
      String tr="Chinmay Sai";
      System.out.println(tr.trim());
      String tr1="  Chinmay Sai  ";
      System.out.println(tr1.trim()); //trim method will not remove the spaces that are in between.
                                      //Changes will be made on the new Object.
      
      System.out.println("\n indexOf Method");
      String name="ChinmaySAi";
      System.out.println("Index of A : "+name.indexOf('A'));
      System.out.println("Index of a : "+name.indexOf('a'));
      
      System.out.println("\n lastIndexOf Method");
      System.out.println("Last Index of i : "+name.lastIndexOf('i'));
      //System.out.println("Index of a : "+name.indexOf('a'));
      System.out.println("Last Index of z :"+name.lastIndexOf('Z'));//If Character is not found in String then -1 will be returned.
      
      
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
