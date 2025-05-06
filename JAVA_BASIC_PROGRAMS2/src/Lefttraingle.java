

/**
 * 
 * 
 * Java Program to Print Left Triangle Star Pattern
 */
//Git Testing Changes
public class Lefttraingle {

	public static void main(String[] args) {

		        
		 
		int j;
		        int n=10;
               for (int i = 0; i < n; i++) {
 
            for (j = 2 * (n - i); j >= 0; j--) {
                System.out.print(" ");
            }
 
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
 
            System.out.println();
        }
	}

}
