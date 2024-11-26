
public class Remote {
	
	public void turnOn(TV myTV) {
		myTV.turnOn();
	}
	
	public void turnOff(TV myTV) {
		myTV.turnOff();
	}
	
	public TV overPowerTV(TV myTV) {
		TV tv = new TV();
		tv.setChannel(100);
		for (int i = 0; i < 8; i++)
			tv.volumeUp();
		return tv;
	}

}
