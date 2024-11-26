
public class TestTwoTV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TV tv1 = new TV("TV1");
		//Remote remote = new Remote(tv1);
		Remote remote = new Remote();
		TV tv2 = new TV("TV2");
		
		tv1.printStatus();
		remote.off(tv1);
		tv1.printStatus();

		tv2.printStatus();
		remote.off(tv2);
		tv2.printStatus();
		
		///create a third tv
		TV tv3 = new TV("Bob");
		tv3.printStatus();
		remote.off(tv3);
		tv3.printStatus();


	}

}
