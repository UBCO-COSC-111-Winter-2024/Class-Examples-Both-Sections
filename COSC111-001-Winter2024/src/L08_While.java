
public class L08_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;	//this is my counter
		
		//This only have one statement in the body (not count++) -- >loop infinitely 
//		while (count < 10)
//			System.out.println("The value is " + count);
//			count++;
		
		//watch out ! 
//		while (count < 10); // -->while (count < 10){};
//		{
//			System.out.println("The value is " + count);
//			count++;
//		}
//		
//		while (count < 10)
//		{
//			System.out.println("The value is " + count++);
//			//count++;
//		}

		//watch out!
		count = Integer.MAX_VALUE - 1;
		while (count > 0)
		{
			System.out.println("The value is " + count);
			count++;
		}
		System.out.println("The final value of count is " + count);	
		
		count = 10;
		while (count > 0)
		{
			System.out.println("The value is " + count);
			count--;   //when counting down, make sure to decrement your counter!
		}
		System.out.println("The final value of count is " + count);	
	}

}
