
public class ConsumePetrol implements CarState{
	
	Car car;
	public ConsumePetrol(Car car)
	{
		this.car = car;
	}

	public void stopCarState()
	{
		System.out.println("Car is not in stop state");
	}
	public void startCarState()
	{
		System.out.println("Car is in start state");
	}
	public void movingCarSatte()
	{
		System.out.println("Car is in start state and moving");
		car.consumePetrol();
	}
	public void fillPetrol()
	{
		
		
	}
	
	public String toString() 
	{
		return "Car is moving and consuming petrol.....";
	}

}
