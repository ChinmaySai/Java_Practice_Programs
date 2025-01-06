import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RightTraingleStar {

	public static void main(String[] args)throws IOException {

		System.out.println("Enter the height of the Pattern : ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int height=Integer.parseInt(br.readLine());
		String star="*";
		for(int i=1;i<=height;i++)
		{
			System.out.println(star);
			star=star+"*";
		}
		
	}

}
