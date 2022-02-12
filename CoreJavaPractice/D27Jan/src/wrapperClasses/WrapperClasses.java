package wrapperClasses;

public class WrapperClasses {
	int length = 10;
	int breadth = 10;
	int height = 10;
	
	public int getVolume()
	{
		return (length * breadth * height);
	}

	public static void main(String[] args) {
		WrapperClasses w;
		w = new WrapperClasses();
		System.out.println("Volume of cube is: " + w.getVolume());

	}

}
