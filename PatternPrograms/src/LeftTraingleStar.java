import java.io.*;

public class LeftTraingleStar {

	public static void main(String[] args) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the height of the Pattern : ");
		String input=br.readLine();
		int height=Integer.parseInt(input);
		for(int i=0;i<height;i++)
		{
			for(int j=0;j<height-i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
