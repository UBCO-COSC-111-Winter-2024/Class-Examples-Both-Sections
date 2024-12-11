
public class Circle extends Shape {    /// child extends parent

	//instance variables
	double radius;
	
	//default
	Circle()
	{
		//this.radius = 10;   		//this directly sets the instance data
		//this.setRadius(10);		//this uses our setter to set the radius
		this(10);					//this calls the 1-arg constructor setting the radius to 10
		//this.isFilled = true;
		this.setFilled(true);		//this will allow
									//access to private data from parent 
									//through the setter
	}
	
	//1-arg
	Circle(double radius)
	{
		//super();					//<-- this is alwaysthere
									// even if you don't type it!
		//#1 - fix by adding no-arg constructor to parent
		//#2 - Or we could just use super and call one of the other constructors
		super("Clyde");
		this.setRadius(radius);   	//this will use our setRadius method and do the safety
									//checking for us!
		System.out.println("Running child constructor");
	}
	
	Circle(double radius, String colour, boolean isFilled)
	{
		this(radius);
		this.setColour(colour);
		this.setFilled(isFilled);
		setName("bob");
		
	}
	
	
	//setter
	public void setRadius(double radius)
	{
		if (radius > 0)
			this.radius = radius;
		else
			radius = 0;
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
	
	//this is an example of method OVERRIDING
	public void setName(String name) {
		System.out.println("Setting the name to be " + name);
		super.setName(name);
	}
	

	//Child is over-riding parent
	public String getName() {
		return "The circles's name is " + super.getName();   //what's going on here????
	}
	
	//this is method overloading (same name; different arguments!)
	public String getName(String anotherName) {
		return "The circles's name is " + super.getName();   //what's going on here????
	}
	
	public void confusingCall(double x) {
		System.out.println("Calling on Circle " + x);
	}

	public void printInfo()
	{
		//A - from circle
		//B - from parent
		System.out.println(this.getName());
		System.out.println("Radius : " + this.radius);
		System.out.println("Area: " + this.getArea());
		System.out.println("Perimeter: " + this.getPerimeter());
		System.out.println("Colour " + this.getColour());
		
	}
	
	public String toString() {
		return "this is Circle!";
	}
}
