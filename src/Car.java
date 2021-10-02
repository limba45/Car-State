
public class Car {
	CarState haspetrol;
	CarState nopetrol;
	CarState consumepetrol;
	
	CarState state;
	int quantitiy;
	public Car(int quantity)
	{
		this.haspetrol=new HasPetrol(this);
		this.nopetrol=new NoPetrol(this);
		this.consumepetrol = new ConsumePetrol(this);
		
		this.quantitiy = quantity;
		if(quantity > 0)
		{
			state = haspetrol;
		}
		else
		{
			state = nopetrol;
		}
		
	}
	
	public void startCarState()
	{
		state.startCarState();
	}
	public void stopCarState()
	{
		state.stopCarState();
	}
	public void movingCarState()
	{
		state.movingCarSatte();
	}
	public void consumePetrol()
	{
		System.out.println("Petrol is consuming");
		if(quantitiy>0)
		{
			quantitiy = quantitiy - 1;
		}
	}
	
	public int getQuantity()
	{
		return quantitiy;
	}
	
	public void fillPetrol(int quantitiy)
	{
		this.quantitiy += quantitiy;
		System.out.println(this.quantitiy+" litters more petrol is filled !!!");
		state.fillPetrol();
	}
	
	void setState(CarState state) 
	{
		this.state = state;
	}
	public CarState getState() 
	{
        return state;
    }

    public CarState getNoPetrol() 
    {
        return nopetrol;
    }

    public CarState getHasPetrol() 
    {
        return haspetrol;
    }
    public CarState getConsumePetrol() 
    {
        return consumepetrol;
    }
    
    
    public String toString() 
    {
		StringBuffer result = new StringBuffer();
		result.append("\n!!!!!!! Car Petrol State  !!!!!!.");
		result.append("\n" + quantitiy + " Litters Petrol");
		
		result.append("\n");
		result.append("Car is in " + state + "\n");
		return result.toString();
	}
	

}
