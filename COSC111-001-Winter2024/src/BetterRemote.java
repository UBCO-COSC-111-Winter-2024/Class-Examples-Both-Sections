
public class BetterRemote {
	
	public static void turnOn(TV myTV) {
		myTV.turnOn();
		myTV.printTvStatus();
	}
	
	public static void turnOff(TV myTV) {
		int x = 0;
		myTV.turnOff();
		myTV.printTvStatus();
		System.out.println(x);
	}

}
