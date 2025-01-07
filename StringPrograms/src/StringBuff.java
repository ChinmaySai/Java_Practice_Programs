
public class StringBuff {

	public static void main(String[] args) {
            StringBuffer sb1=new StringBuffer();
            System.out.println(sb1.length());//No of character stored
            System.out.println(sb1.capacity());//How many characters can be stored
            sb1.append("abcdefghijklmnop");
            System.out.println(sb1.length());
            System.out.println(sb1.capacity());
            //By the above append String capacity has been filled up till 16  charatcers.
            //Now when we append more characters then the size will be incereased in the below Format
            sb1.append("q");
            System.out.println(sb1.length());////The length  StringBuffer has been changed to 17 due to 
                                                //capacity will also get incereased
                                                
            System.out.println(sb1.capacity());   //new capacity=(Old capacity+1)*2
            
	}

}
