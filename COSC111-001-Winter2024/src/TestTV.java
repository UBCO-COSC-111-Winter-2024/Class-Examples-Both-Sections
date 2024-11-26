
public class TestTV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TV tv = new TV();
		
		tv.printTvStatus();
		
		//lets check turning down the TV from 1 and turning the channel down from 1 
		tv.channelDown();   //this should be 120
		tv.printTvStatus();
		
		tv.channelUp();		//this should be 1
		tv.printTvStatus();
		
		tv.setChannel(2);
		tv.printTvStatus();
		
		tv.setChannel(-2);
		tv.printTvStatus();
		
		tv.setChannel(2000);
		tv.printTvStatus();
		
		tv.volumeDown();			//volume should still be 1
		tv.printTvStatus();
		
		for (int i = 0; i < 10; i++)
			tv.volumeUp();
		tv.printTvStatus();
		
		tv.turnOff();
		tv.printTvStatus();

		tv.turnOn();
		tv.printTvStatus();
		
		//Test my remote
		//BUT First, instantiate
		
		Remote remote = new Remote();
		tv.turnOff();
		tv.printTvStatus();

		remote.turnOn(tv);		//turn on TV with my remote

		tv.printTvStatus();
		
		TV tv2 = new TV();
		tv2.turnOff();
		tv2.printTvStatus();

		remote.turnOn(tv2);
		tv2.printTvStatus();
		
		
		//don't worry .... (for now)
		//tv2 = remote.overPowerTV(tv2);


	}

}
