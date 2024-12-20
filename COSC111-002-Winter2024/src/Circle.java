
public class Circle extends Shape{

	//instance variables
	private double radius;
	
	public final int number = 55;
	
	//default
	Circle()
	{
		//this.radius = 10;   		//this directly sets the instance data
		//this.setRadius(10);		//this uses our setter to set the radius
		this(10);					//this calls the 1-arg constructor setting the radius to 10
		System.out.println("Circle No-Arg constructor");
	}
	
//	//1-arg
	Circle(double radius)
	{
		this.setRadius(radius);   	//this will use our setRadius method and do the safety
									//checking for us!
	}
	
	Circle(double radius, String colour, boolean isFilled)
	{
		this(radius);
		this.setColour(colour);
		this.setFilled(isFilled);		
	}
	
	
	//setter
	public void setRadius(double radius)
	{
		if (radius > 0)
			this.radius = radius;
		else
			radius = 0;
	}
	public double getRadius() {
		return this.radius;
	}
	
	//getters
	public double getArea()
	{
		return Math.PI * this.radius * this.radius;
	}
	
	public double getPerimeter()
	{
		return 2 * Math.PI * this.radius;
	}
	
	public void printInfo()
	{
		System.out.println("Radius : " + this.radius);
		System.out.println("Area: " + this.getArea());
		System.out.println("Perimeter: " + this.getPerimeter());
		
	}
}
	
	
