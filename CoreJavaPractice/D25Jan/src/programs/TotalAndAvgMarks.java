package programs;

import java.util.Scanner;

	class student
	{    
	    private int a[ ]=new int[10];
	    public String  st = new String();
	    public Scanner scn=new Scanner(System.in);
		private int total;
		private float avg;
	    void read()
	    {   
	    	System.out.println("enter student name");           
	        st=scn.nextLine();       
	        System.out.println("Enter student ID:");
	        int n=scn.nextInt();
	        System.out.println("Enter 6 subject marks:");
	        for(int i=0;i<5;i++) {
	        	a[i]=scn.nextInt();	        	
	        }
	        calculate();
	        display(n);
	    }
	    void calculate()
	    {        for(int i=0;i<5;i++)
	                  total+=a[i];
	                  avg=(total/5);
	    }
	    void display(int n)
	    {         System.out.println("name::"+st);
	              System.out.println("Student ID::"+n);
	              System.out.println("total::"+total);
	              System.out.println("average::"+avg);
	    }
	    
	}
	    
	    public class TotalAndAvgMarks{
	    	public static void main(String[] args) {
	    		student s=new student();
	    		s.read();
//         		s.calculate();
//         		s.display();
	    	}
	    }

