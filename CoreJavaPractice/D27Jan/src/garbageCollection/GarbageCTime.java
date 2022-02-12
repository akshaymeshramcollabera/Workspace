package garbageCollection;

public class GarbageCTime {

	public static void main(String[] args) {
		int SIZE = 200;
		StringBuffer s;
		for(int i=0; i<SIZE; i++)
		{
			
		}
		System.out.println("Garbage collection started explicitly");
		long time = System.currentTimeMillis();
		System.gc();
		System.out.println("It tooks " + (System.currentTimeMillis() - time) + " ms ");
	}

}
