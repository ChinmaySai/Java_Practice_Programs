import java.util.*;
public class BinarySearch
{
	public static void main(String[] args) {
		int a[]={10,20,30,40,50};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Search Key :");
		int search_element=sc.nextInt();
		
		int low=0;
		int high=a.length-1,mid=0;
		boolean found=false;
		while(low<=high)
		{
		    mid=(low+high)/2;
		    if(a[mid]==search_element)
		    {
		        System.out.println(search_element+" Found at Index "+mid);
		        found=true;
		        break;
		    }
		    else if(a[mid]>search_element)
		    {
		       high =mid-1;
		    }
		    else if(a[mid]<search_element)
		    {
		        low=mid+1;
		    }
		}
		if(found==false)
		{
		    System.out.println("Search key not found");
		}
	}
}

