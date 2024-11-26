
public class TV {

	private static int tvCount;
	
	private String name;
	private int channel;
	private int volumeLevel;
	private boolean on;
	private int id;
	
	public TV() {
		this.channel = 1;
		this.volumeLevel = 1;
		this.on = true;
		tvCount ++;
		this.id = tvCount;
	}
	
	public TV(String name)
	{		
		this();
		this.name = name;
	}
	
	public int getID()
	{
		return this.id;
	}
	
	public void setChannel(int channel) {
		this.channel = channel;
	}

	public void setVolumeLevel(int volumeLevel) {
		this.volumeLevel = volumeLevel;
	}

	public void turnOn(){
		this.on = true;
		this.volumeLevel = 1;  ///reset volume level
	}
	
	public void turnOff(){
		this.on = false;

	}
	
	public void channelUp(){
		this.channel ++;
		if (this.channel == 121)  //wrap around
			this.channel = 1;
	}
	public void channelDown(){
		this.channel --;
		if (this.channel == 0)  //wrap around
			this.channel = 120;
	}
	
	public void volumeUp(){
		this.volumeLevel ++;
		if (this.volumeLevel > 7)  //wrap around
			this.volumeLevel = 7;
	}
	public void volumeDown(){
		this.volumeLevel --;
		if (this.volumeLevel < 1)  //wrap around
			this.volumeLevel = 1;
	}
	
	public void printStatus()
	{
		System.out.println("Name: " + this.name);
		System.out.println("ID: " + this.id);
		System.out.println("Power: " +this.on);
		System.out.println("Volume: " +this.volumeLevel);
		System.out.println("Channel: " +this.channel); 
		System.out.println("Total number of TVs: " + tvCount);
		System.out.println("");

	}
	
}
