
public class BubbleSort {

	public static void main(String[] args) {
	
		int[] a= {100,20,39,43,85};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length-i;j++)
			{
				if(a[j]<a[j-1])
				{
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
		
		for(int el:a)
		{
			System.out.print(el+" ");
		}
	}

}