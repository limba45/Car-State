
public class NoPetrol implements CarState{
	
	
	Car car;
	public NoPetrol(Car car)
	{
		this.car = car;
	}
	public void stopCarState()
	{
		System.out.println("Car is stopped, because it has not petrol");
	}
	public void startCarState()
	{
		System.out.println("Car is not starting because of empty tank");
	}
	public void movingCarSatte()
	{
		System.out.println("Car is not moving");
	}
	public void fillPetrol()
	{
		System.out.println("Car tank is filling up.....");
		car.fillPetrol(5);
		
	}
	
	public String toString() 
	{
		return "Petrol is filling ......";
	}
	

}
