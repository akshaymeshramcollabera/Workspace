package programs;

//java program Using a Car object in a different class

class Car
{
	String licensePlate;
    double speed;       
    double maxSpeed;
}
public class CarTest {

	public static void main(String[] args) {
		 Car c = new Car();
         c.licensePlate = "DL 45A 5636";
         c.speed = 70.0;
         c.maxSpeed = 123.45;
         System.out.println(c.licensePlate + " is moving at " + c.speed + " kilometers per hour.");  
	}

}
