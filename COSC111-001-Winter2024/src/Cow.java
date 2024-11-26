
public class Cow {

	//Attributes
	//Instance variables
	String DEFAULT_COLOUR = "black";
	
	private String colour;
	private String name;
	private int stomach;   //percentage of how full the cow is... [0, 100]
	boolean isFull;
	int x;
	int y;
	
	//this is needed is we want to use the no-arg constructor along with
	//constructors that take arguments
	public Cow()
	{
		this("Bessy");
	}
	
	public Cow(String name)
	{
		this(name,"black");

	}
	
	public Cow(String name, String colour)
	{
		this.name=name;
		this.colour = colour;
	}
	
	public Cow(String name, String colour, int stomachLevel)
	{
		this(name, colour);
		if (stomachLevel < 100 & stomachLevel >= 0) {
			this.stomach = stomachLevel;
			this.isFull = false;
		}
		else if (stomachLevel >= 100)
		{
			this.isFull = true;
			this.stomach = 100;
		}
		else
		{
			this.stomach = 0;
			this.isFull = false;
		}
	
	}
	
	public int[] getPosition()
	{
		int[] pos = new int[2];
		pos[0] = x;
		pos[1] = y;
		
		return pos;
	}
	
	public void moveLeft()
	{
		x--;
	}
	
	public void moveRight()
	{
		x++;
	}
	
	public void moveUP()
	{
		y++;
	}
	
	public void moveDown()
	{
		y--;
	}
	
	public void digest()
	{
		if (stomach > 0)
			stomach--;
		else
		{
			System.out.println("My stomach is empty!! Feeeeeeed meeeeee!");
		}
	}
	
	public void eat()
	{
		if (!isFull) {
			stomach++;
			if (stomach == 100)
				isFull = true;
			else
				isFull = false;
		}
		else
		{
			System.out.println("Stop feeding me! " + name + " is full");
		}
		
	}
	//methods
	public void says(String s)
	{
		System.out.println(name + " says " + s);
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getColour() {
		return this.colour;
	}
	
	public void printCowInfo()
	{
		System.out.println("Cow " + this.getName() + " is the colour " + this.getColour());
		System.out.println("Stomach Level : " + this.stomach + " isFull: " + this.isFull);
	}
}
