
public class TestTwoTVs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv1 = new TV("No one cares");
		tv1.printTvStatus();
		
		TV tv2 = new TV("bob");
		tv2.printTvStatus();
		tv1.printTvStatus();
		
		//BetterRemote br = new BetterRemote();
		
		BetterRemote.turnOff(tv1);
		tv1.printTvStatus();
	}

}
