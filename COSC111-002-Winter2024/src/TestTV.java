
public class TestTV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TV tv = new TV();
		
		tv.printStatus();
		
		tv.channelDown();
		tv.volumeDown();
		tv.printStatus();
		
		for (int i = 0; i< 8; i++)
			tv.volumeUp();
		tv.channelUp();
	
		tv.turnOff();
		tv.printStatus();
		tv.turnOn();
		tv.printStatus();

	}

}
