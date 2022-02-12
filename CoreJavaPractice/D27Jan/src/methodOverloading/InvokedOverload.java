package methodOverloading;

class A extends Object
{
	public void m()
	{
		System.out.println("m()");
	}
}

class B extends A
{
	public void m(int x)
	{
		System.out.println("m(int x");
	}
	
	public void m(String y)
	{
		System.out.println("m(String y");
	}
}

public class InvokedOverload {

	public static void main(String[] args) {
		B var = new B();
        var.m();
        var.m(3);
        var.m("String");

	}

}
