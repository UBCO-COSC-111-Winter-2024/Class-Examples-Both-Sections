
public class Rectangle extends Shape {
	
	private double width;
	private double height;
	
	public Rectangle() {
		this(5.0, 2.0);
		this.width =10.5;
	}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(double width, double height, String colour, boolean isFilled) {
		this.width = width;
		this.height = height;
		this.setColour(colour);				//These will come from the parent class
		this.setFilled(isFilled);			//These will come from the parent class
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getArea()
	{
		return this.height * this.width;
	}
	
	public double getPerimeter() 
	{
		return 2*this.height + 2*this.width;
	}
	
	public String toString()
	{
		//this is an advanced concept!
		String str = "This is a rectangle of width: " +this.width + " and height: " + this.height;
		str += super.toString();
		return str;
	}
	
	
}
