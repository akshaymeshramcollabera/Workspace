package compileTimePolymorphism;

class A
{
	public void fun1(int x)
	{
		System.out.println("The value of class A is: " + x);
	}
	
	public void fun1(int x, int y)
	{
		System.out.println("The value of B class is: " + x + " and " + y);
	}
}

public class CompileTime {

	public static void main(String[] args) {
		A obj = new A();
		obj.fun1(2);
		obj.fun1(2,5);

	}

}
