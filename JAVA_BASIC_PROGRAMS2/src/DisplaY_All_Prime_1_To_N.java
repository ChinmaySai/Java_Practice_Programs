/*
*Java Program to find the Prime Numbers till N
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DisplaY_All_Prime_1_To_N {

	public static void main(String[] args) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String number=br.readLine();
		int num=Integer.parseInt(number);
		ArrayList<Integer> primeList=new ArrayList();
		boolean isPrime=false;
		for(int i=1;i<=num;i++)
		{
			isPrime=false;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
				isPrime=true;	
				}
			}
			if(!isPrime)
			{
				primeList.add(i);
			}
			
		}
		System.out.println("Prime Numbers list"+primeList);
	}

}
