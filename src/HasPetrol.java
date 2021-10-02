
public class HasPetrol implements CarState{
	
	Car car;
	public HasPetrol(Car car)
	{
		this.car = car;
	}
	


	public void stopCarState()
	{
		System.out.println("Car is in stop state,,, about to start");
	}
	public void startCarState()
	{
		System.out.println("Car is started ...");
	}
	public void movingCarSatte()
	{
		System.out.println("Car is not moving");
	}
	public void fillPetrol()
	{
		
	}
	
	public String toString() 
	{
		return "Car is starting ........";
	}

}
