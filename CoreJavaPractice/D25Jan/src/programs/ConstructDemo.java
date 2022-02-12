package programs;

class Constdemo
{    int x,y,z;
	Constdemo() { x=y=z=1; }   // default constructor
	Constdemo(int a) { x=y=z=a; }     // parameterized constructor
	Constdemo(int p,int q,int r) { x=p; y=q; z=r; }   // param. Constructor
	Constdemo(Constdemo p) {x = p.x; y=p.y;  z=p.z; } //copy constructor
	void sum()
	{    
		System.out.println("sum of the values:"+ (x+y+z));
	}
}
public class ConstructDemo {

	public static void main(String[] args) {
		Constdemo c1=new Constdemo(); //explicit call to default cons.
        Constdemo c2=new Constdemo(5); //explicit call to parameterized cons.
        Constdemo c3=new Constdemo(1,2,3); //explict call to parameterized cons.
        Constdemo c4=new Constdemo(c3); //implicit call to copy cons.
        c1.sum(); c2.sum();
        c3.sum(); c4.sum();
	}

}
