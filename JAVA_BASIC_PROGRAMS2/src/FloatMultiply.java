import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FloatMultiply {

	public static void main(String[] args) {

		
		float f1=0.0f;
		float f2=0.0f;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter floating point numbers");
		try {
			f1=Float.parseFloat(br.readLine());
			f2=Float.parseFloat(br.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Multiplication of two floating numbers :"+(f1*f2));
		
	}

}
