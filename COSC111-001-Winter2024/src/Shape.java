
public  class Shape {


	private String name = "bob";
	private final String colour;
	private boolean isFilled;
	public static int numberOfShapes;
	
	public Shape() {
		colour = "red";
		//all uninitialized instance data will be initialized!!!
		//If something is final, it can't be changed!!1
		
		//increase number of shapes
		numberOfShapes++;
		System.out.println("The number of shapes is : " + numberOfShapes);
	}
	
	
	public Shape(String name)
	{
		this();
		//this.name = name;
		System.out.println("Running parent's constructor");
	}
	
	public String getColour() {
		return colour;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	public boolean isFilled() {
		return isFilled;
	}
	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}
	
	public String getName() {
		return name;
	}

	public  void setName(String name) {
		this.name = name;
	}
	
	public String toString()
	{
		return "This is shape: colour: " + this.colour + ", isFilled is " + this.isFilled;
	}
	
	public void doNothing() {
		//int x;   //this will cause problems because x isn't initialized.
		//System.out.println(x);
		
	}
	
	public void confusingCall(int x) {
		System.out.println("Calling on Shape " + x);
	}
	
	
	//Need to be invoked in a `static' fashion ->  use the class to call the method.
	public static void printNumberOfObjects()
	{
		System.out.println("The number of shapes is : " + numberOfShapes);
	}
	
}
