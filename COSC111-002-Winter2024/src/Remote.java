
public class Remote {

	//instance date
	private TV myTV;
	private int remoteID;
	
	//static data 
	private static int numberOfRemotes;
	
	public Remote()
	{
		numberOfRemotes++;
		this.remoteID = numberOfRemotes;
	}
	
	public Remote(TV myTV)
	{
		this.myTV = myTV;
	}
	
	public void on() {
		this.myTV.turnOn();
	}
	
	public void on(TV tv)
	{
		tv.turnOn();
	}
	
	public void off() {
		this.myTV.turnOff();		
	}
	
	public void off(TV tv)
	{
		System.out.println("Remote #" + this.remoteID + " is turning off the TV");
		tv.turnOff();
	}
	
	//These are static methods that need to be invoked
	//in a 'static' fashion (ie don't create an object to use them
	public static void powerOn(TV tv)
	{
		//We can't access non-static data (ie instance data) in a static method!!!
		//System.out.println("Remote #" + remoteID + " is turning off the TV");
		tv.turnOn();
		
		
	}
	
	public static void powerOff(TV tv)
	{
		tv.turnOff();
		int z = 10;
		System.out.println("The number of the day is: " + z + "!  (Followed by evil laugh)");
		System.out.println("I'm turning off TV " + tv.getID());
		z++;
	}
}
