package entities;

public class Car 
{
	private Tire tires;
	private Engine engine;
	
	public Tire getTires()
	{
		return tires;
	}
	
	public void setTires(Tire tires)
	{
		this.tires = tires;
	}
	
	public Engine getEngine()
	{
		return engine;
	}
	
	public void setEngine(Engine engine)
	{
		this.engine = engine;
	}
	
	public String toString()
	{
		return "Car [tires=" + tires + ", engine=" + engine + "]";
	}
}
