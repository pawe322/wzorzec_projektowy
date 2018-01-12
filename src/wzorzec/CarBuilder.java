package wzorzec;

import entities.Car;

public interface CarBuilder 
{
	public void buildTires();
	
	public void buildEngine();
	
	public Car getCar();
}
