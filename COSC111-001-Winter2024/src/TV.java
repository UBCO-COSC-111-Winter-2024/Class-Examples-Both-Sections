
public class TV {

	
	//instance data
	private String name;
	private int channel;
	private int volumeLevel;
	private boolean on;
	
	static int countOfTVs;
	
	public TV()
	{
		this.volumeLevel = 1;
		this.channel = 1;
		this.on = true;
		countOfTVs ++;
	}
	
	public TV(String name) {
		this();
		this.name = name;
	}
	
	public void setChannel(int channel) {
//		if ((channel > 120) || (channel < 0))
//		{}
//		else
//			this.channel = channel;
		
		//this makes way more sense!!
		if ((channel <= 120) && (channel >= 1))
		{
			this.channel = channel;
		}
			
	}

	public void setVolumeLevel(int volumeLevel) {
		if ((volumeLevel <= 7) && (volumeLevel >= 1))
		{
			this.volumeLevel = volumeLevel;
		}
	}

	
	
	public void turnOn() {
		//this();   YOU CAN'T DO THIS AFTER THE Object is built ((can only be called from a constructor()
		this.on = true;
		this.volumeLevel = 1;			//set these back to default
		this.channel = 1;			
	}
	
	public void turnOff() {
		this.on = false;
	}
	
	public void volumeUp() {
		
		if (this.volumeLevel < 7)
			this.volumeLevel ++;
		//when we are at max, stay at max
		
		//if (this.volumeLevel > 7) this.volumeLevel = 7;
	}
	
	public void volumeDown() {
		
		if (this.volumeLevel > 1)
			this.volumeLevel --;
	}
	//
	public void channelUp() {
		this.channel ++;
		if (this.channel >= 121)
			this.channel = 1;
	}
	
	public void channelDown() {
		this.channel --;
		if (this.channel <= 0)   //could have also used strictly equals (==)
			this.channel = 120;
	}
	
	public static void printNumberOfTVs()
	{
		System.out.println(countOfTVs);
		//System.out.println(volumeLevel);  //Statics methods can only access static data!!!
	}
	
	public void printTvStatus() {
			System.out.println(this.name + " is on: " + this.on);
			System.out.println("Channel: " + this.channel);
			System.out.println("Volume: " + this.volumeLevel);
			System.out.println("Count of TVs: " + countOfTVs);


	}
}
