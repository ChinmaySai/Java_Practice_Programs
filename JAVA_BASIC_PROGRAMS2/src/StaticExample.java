class Demo
{
	static int a;
	static int b;
	static
	{
		a=10;
		b=20;
		System.out.println("static block");

	}
	static void disp()
	{
		System.out.println("static method");
	}
	int x,y;
	
	{
		//This is Java Block
		x=10;
		x=20;
		System.out.println("Java Block");
	}
	
	void disp1()
	{
		System.out.println("Non Static Method");
		System.out.println(a);
		System.out.println(b);
	}
	Demo()
	{
		System.out.println("Constructor");
	}
}
public class StaticExample {

	public static void main(String[] args) {
		  Demo.disp();
          Demo d=new Demo();
          d.disp1();

	}

}
