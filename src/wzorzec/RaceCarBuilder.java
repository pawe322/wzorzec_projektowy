package wzorzec;

import entities.Car;
import entities.Engine;
import entities.Tire;

public class RaceCarBuilder implements CarBuilder
{
	private Car car;
	
	public RaceCarBuilder()
	{
		this.car = new Car();
	}
	
	public void buildTires()
	{
		Tire tire = new Tire();
		tire.setDurability(50);
		tire.setType("Slick");
		car.setTires(tire);
	}
	
	public void buildEngine()
	{
		Engine engine = new Engine();
		engine.setType("v8");
		car.setEngine(engine);
	}
	
	public Car getCar()
	{
		return car;
	}
	
}
