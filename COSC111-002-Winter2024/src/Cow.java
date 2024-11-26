import java.util.Arrays;

public class Cow {
	
	private String nickname;
	private int stomach;
	private boolean isFull;
	private int x;
	private int y;
	private int z;
	private int[] pos = new int[3];			//[x, y, z]
	
	
	//As soon as you created an overloaded construtors, the default constructors is 
	//no longer available.  If you want to use the default contructors, you need
	//to add it back in...
	Cow(String nickname, int x, int y)
	{
		this.nickname = nickname;			// 'this' is used to refer to instance data for the class. 
		this.x = x;
		this.y = y;
		this.stomach = 0; 		//cow has empty stomach -> same as default values
		this.isFull = false; 	//cow isn't full -> same as default values
		
	}
	
	
	Cow(String nickname){
		this(nickname, 0, 0);  	//this will try to find another constructors that matches the 
								// this signature
		this.isFull = false;

	}
	
	Cow(String nickname, int stomach)
	{
		this.nickname = nickname;
		if (stomach > 100)
			this.stomach = 100;
		else if (stomach < 0)
			this.stomach = 0;
		else 
			this.stomach = stomach;
		
		if (this.stomach == 100)
			this.isFull = true;
		else 
			this.isFull = false;
		
		this.pos[0] = 0;  //x pos
		this.pos[1] = 0;  //y pos
		this.pos[2] = 0;  //z pos
	}
	
	//default constructor.
	Cow()
	{
		
	}

	public int getStomachContents() {
		return this.stomach;
	}
	
	public void setStomachContents(int value)
	{
		if (value >= 100)
		{
			this.stomach = 100;
			this.isFull = true;
		}
		else if (value <= 0)
		{
			this.stomach = 0;
			this.isFull = false;	
		}
		else
		{
			this.stomach = value;
			this.isFull = false;
		}
	}
	//methods
	public void digest()
	{
		if (stomach > 0)
			stomach--;
		if (stomach != 100)
			isFull = false;
	}
	
	public void drop()
	{
		if (z > 10)
		{
			System.out.println("Splat!!!!");
		}
		else
		{
			//System.out.println("Ouch!!!!");
			say("Ouch!!!");
		}
		
		z = 0;
		
	}
	public void say()
	{
		System.out.println(nickname + " says moooooooov over!");
	}
	public void say(String s)
	{
		System.out.println(nickname + " says " + s);
	}
	
	public void eat(){
		if (!isFull)
			stomach++;
		
		if (stomach == 100)
			isFull = true;
	}
	
	public void getPosition()
	{
		if (z > 0)
			System.out.println(nickname + " is flying!");
		else
			System.out.println(nickname + " is at x: " + x + " , y: " + y);
	}
	
	public void hover() {
		if (!isFull) {
			z++;
			System.out.println(nickname + " is now flying away and is " + z + " meters high!");
		}
		else
		{
			System.out.println(nickname + " is too full to be picked up by the ufo.");
		}
	}
	public void getCowStatus() {
		System.out.println("Nickname: " + this.nickname);
		System.out.println("Stomach Level: " + this.stomach);
		System.out.println("Is full?: " + this.isFull);
		System.out.println("Position: " + Arrays.toString(pos));

	}
	
	//this is for next term (121)
	public String toString(){
		String str = "Nickname: " + this.nickname + ", Stomach Level: " + this.stomach + ", Is full?: " + this.isFull;
		return str;
	}
}
