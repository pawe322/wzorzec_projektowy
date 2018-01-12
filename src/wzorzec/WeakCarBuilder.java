package wzorzec;

import entities.Car;
import entities.Engine;
import entities.Tire;

public class WeakCarBuilder implements CarBuilder
{
	private Car car;
	
	public WeakCarBuilder()
	{
		this.car = new Car();
	}
	
	public void buildTires()
	{
		Tire tire = new Tire();
		tire.setDurability(100);
		tire.setType("Hard");
		car.setTires(tire);
	}
	
	public void buildEngine()
	{
		Engine engine = new Engine();
		engine.setType("1.0l");
	}
	
	public Car getCar()
	{
		return car;
	}
}
