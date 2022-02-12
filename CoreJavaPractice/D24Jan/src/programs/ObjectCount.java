package programs;

//program to count the objects created for a particular class

class ObjCount
{
	 static int count;
     public ObjCount()
     {
    	 count++;
     }
     static void display()
     {
    	 System.out.println("Count of Objects:"+count);
     }
}

public class ObjectCount {

	public static void main(String[] args) {
		ObjCount o1,o2,o3;
        o1 = new ObjCount();
        o2 = new ObjCount();
        o3 = new ObjCount();
        ObjCount.display();

	}

}
