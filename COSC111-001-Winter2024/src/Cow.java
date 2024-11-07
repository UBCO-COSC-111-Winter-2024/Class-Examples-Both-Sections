
public class Cow {

	//Attributes
	//Instance variables
	String colour;
	String name;
	int stomach;   //percentage of how full the cow is... [0, 100]
	boolean isFull;
	int x;
	int y;
	
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
}
