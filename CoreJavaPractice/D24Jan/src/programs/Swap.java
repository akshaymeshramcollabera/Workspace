package programs;

class Swapp
{
	 int x=10,y=20;             
     public void swapwot()
     {
    	 x=x+y;
         y=x-y;
         x=x-y;
     }
     
     public void swapwt()
     {   int temp;
         temp =x;
         x=y;
         y=temp;
     }
     
     public void display()
     {
    	 System.out.println ("value of x: "+x+"  value of y: "+y);
     }
}

public class Swap {

	public static void main(String[] args) {
		Swapp s=new Swapp();            
        s.swapwt();
        s.display();
        s.swapwot();
        s.display();
	}

}
