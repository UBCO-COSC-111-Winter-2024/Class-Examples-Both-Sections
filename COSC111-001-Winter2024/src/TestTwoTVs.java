
public class TestTwoTVs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv1 = new TV("No one cares");
		tv1.printTvStatus();
		
		TV tv2 = new TV("bob");
		tv2.printTvStatus();
		tv1.printTvStatus();
		
		BetterRemote br = new BetterRemote();
		
		//br.turnOff(tv1);
		BetterRemote.turnOff(tv1);
		BetterRemote.turnOff(tv2);
		
		TV tv3 = new TV("Charlie");
		BetterRemote.turnOff(tv3);

		TV.printTotalNumberOfTVs();
		
		//tv1.printTvStatus();
	}

}
