public class StaticFlowController {

	static int a;
	static int b;
	static
	{
		a=10;
		b=20;
		System.out.println("static block");
		disp();

	}
	
	static void disp()
	{
		System.out.println("static method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside the Main Method");
	}

}
