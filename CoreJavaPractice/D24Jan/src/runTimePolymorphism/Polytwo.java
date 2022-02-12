package runTimePolymorphism;

//Write a Java Program for concept of Runtime Polymorphism
class A
{    public void fun1(int x)
  {
		System.out.println("int in Class A is : " + x);
  }
}
class B extends A
{    public void fun1(int x)
  {    System.out.println("int in Class B is : " + x);
  }
}
public class Polytwo {

	public static void main(String[] args) {
		A obj;
        obj=new A(); // line 1
        obj.fun1(2);  // line 2 (prints "int in Class A is : 2")
        obj=new B();  // line 3
        obj.fun1(5);  // line 4 (prints "int in Class A is : 5")
	}

}
