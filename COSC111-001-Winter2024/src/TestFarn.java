import java.util.Arrays;

public class TestFarn {

	public static void main(String[] args) {

		Cow cow1 = new Cow();			//This creates an instance of a cow (mooooo!)
		Cow cow2 = new Cow();
		
		System.out.println(cow1);	//ths prints off the object reference
		
		//how do I set my attributes with my cow?
		
		cow1.name = "Steve the cow";  //this sets the name attribute
		
		System.out.println(cow1.name);
		
		System.out.println(cow2.name);
		cow2.name = "Gordon";
		System.out.println(cow2.name);
		
		cow1.says("mooo!!!");
		cow2.says("mooo!!!");
		
		//cow1.stomach = 200;  //we have to be careful when accessing instance data (we might break things)
		
//		for (int i = 0; i < 300 ; i++)
//		{
//			cow1.eat();
//			System.out.println(cow1.stomach);
//		}
//		
		do
		{
			cow1.eat();
		}while(!(cow1.isFull));
		
		System.out.println("Full");
		
		for (int i = 0; i < 300 ; i++)
			cow1.digest();
		
		
		int[] pos = cow1.getPosition();
		
		System.out.println(cow1.name + " is at " + Arrays.toString(pos));
		cow1.moveDown();

		
		System.out.println(cow1.name + " is at " + Arrays.toString(cow1.getPosition()));

	}
	

}
