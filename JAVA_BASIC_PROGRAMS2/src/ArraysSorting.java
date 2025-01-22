import java.util.*;
public class ArraysSorting
{
	public static void main(String[] args) {
		int a[]=new int[5];
//Sorting the Array using utility Arrays Class
		int ar[]={50,25,36,85,2,75,9};
		Arrays.sort(ar);
		System.out.println();
			for(int ele:ar)
		{
		    System.out.print(ele+" ");
		}
		
	}
}