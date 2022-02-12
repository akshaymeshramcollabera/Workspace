package programs;

//Write a Java Program to swap two numbers using Third and Without Third variable using dynamic (or) Keyboard input values.

import java.io.*;

class Swapppp            
{   
	int x,y;             
    public void readxy() throws IOException
    {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));              
    	System.out.println("Enter the values for x and y:");
        x = Integer.parseInt(br.readLine());
        y = Integer.parseInt(br.readLine());
    }
    
    public void swapwot()
    {
    	x=x+y;
        y=x-y;    
        x=x-y;
    }
    
    public void swapwt()
    {
    	int temp;
        temp =x;
        x=y;    
        y=temp;
    }
    
    public void display()
    {    
    	System.out.println("value of x: "+x+"  value of y: "+y);
    }
    
}

public class SwapDemo {

	public static void main(String[] args) throws IOException {
		Swapppp s=new Swapppp();            
        s.readxy();
        s.swapwt();
        s.display();
        s.swapwot();
        s.display(); 

	}

}
