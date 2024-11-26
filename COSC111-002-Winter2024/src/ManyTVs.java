
public class ManyTVs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TV[] tvArray = new TV[4];
		
		//Will it work?  A -> Yes?
						//B-> No?   <--  We need to rememebr to instantiate the objects
		
//		for (TV tv : tvArray)
//		{
//			tv.printStatus();
//		}
		
		//don't do this!
//		for (TV tv : tvArray)
//		{
//			tv = new TV();
//		}
		
		
		// this will create an array instantiate objected
		for (int idx = 0; idx < tvArray.length;idx++)
		{
			tvArray[idx] = new TV("Name"+idx); 
		}
		
		for (TV tv : tvArray)
		{
			tv.printStatus();
		}
		
		for (int idx = 0; idx < tvArray.length;idx++)
		{
			TV tv = tvArray[idx];
			//tv.turnOff(); 
			//Remote.powerOff(tv);
			Remote.powerOff(tvArray[idx]);
		}
	}

}
