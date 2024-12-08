import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadDataBuffered {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Entering the number for which you want to see Multiplication table :");
		int num=0;
		try
		{
		num=Integer.parseInt(br.readLine());
		for(int i=1;i<=10;i++)
		{
		System.out.println(num+" X "+i+" = "+(num*i));	
		}
		}
		catch(NumberFormatException e)
		{
			System.out.println("Please enter Integer only.");
		}
		
		

	}

}
