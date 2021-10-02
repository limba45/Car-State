
public class TestState {

	public static void main(String[] args) 
	{
		
		Car car = new Car(8);
		
		System.out.println(car);
		car.startCarState();
		car.movingCarState();
		
		System.out.println(car);
		car.startCarState();
		car.movingCarState();
		car.stopCarState();
		
		System.out.println(car);
		car.stopCarState();
		car.fillPetrol(6);
		System.out.println(car);
		

	}

}
