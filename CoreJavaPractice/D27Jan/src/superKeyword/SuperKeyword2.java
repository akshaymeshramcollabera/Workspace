package superKeyword;

class student2
{
	public student2(String name)
	{
		System.out.println("super: " + name);
	}
}

class exam2 extends student2
{
	public exam2(int score)
	{
		super("Akshay");
		System.out.println("sub: " + score);
	}
}

public class SuperKeyword2 {

	public static void main(String[] args) {
		exam2 obj2 = new exam2(0);

	}

}
