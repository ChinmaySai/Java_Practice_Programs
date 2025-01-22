import java.util.*;
public class ArrayOperations
{
	public static void main(String[] args) {
		int a[]=new int[5];
		//when you want to fill all the elements of the array with Similar Value
		for(int ele:a)
		{
		    System.out.print(ele+" ");
		}
		System.out.println();
		Arrays.fill(a,85);
		//All the 5 indices of array will be filled with 85
		for(int ele:a)
		{
		    System.out.print(ele+" ");
		}
		
	}
}