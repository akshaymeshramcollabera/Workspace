package programs;

class ConstDemo
{
	int x,y,z;
    ConstDemo() { x=y=z=1; }   // default constructor
    ConstDemo(int a) { x=y=z=a; }     // parameterized constructor
    ConstDemo(int p,int q,int r) { x=p; y=q; z=r; }   // param. Constructor
    ConstDemo(ConstDemo p) {x = p.x; y=p.y;  z=p.z; } //copy constructor
    void sum()
    {
    	System.out.println("sum of the values:"+ (x+y+z));
    }
}

public class ConstructDemo {

	public static void main(String[] args) {
		ConstDemo c1=new ConstDemo(); //explicit call to default cons.
		ConstDemo c2=new ConstDemo(5); //explicit call to parameterized cons.
		ConstDemo c3=new ConstDemo(1,2,3); //explict call to parameterized cons.
		ConstDemo c4=new ConstDemo(c3); //implicit call to copy cons.
        c1.sum();
        c2.sum();
        c3.sum();
        c4.sum();
	}

}
