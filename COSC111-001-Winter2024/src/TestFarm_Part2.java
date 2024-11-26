
public class TestFarm_Part2 {
	
	public static void printCowInfo(Cow c)
	{
		System.out.println("Cow " + c.getName() + " is the colour " + c.getColour());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cow c1 = new Cow("Ralph");
		Cow c2 = new Cow("Sally","red");
		
//		printCowInfo(c1);
//		
//		printCowInfo(c2);
//		
		c1.printCowInfo();
		
		Cow c3 = new Cow("Bob","green",14);
		c3.printCowInfo();
		c3 = new Cow("Bob","green",20000);
		c3.printCowInfo();
		c3 = new Cow("Bob","green",-200
				);
		c3.printCowInfo();
		
		c3 = null;
		
		//c3.printCowInfo();
		
		for (int i = 0; i < 3000; i++)
		{
			c3 = new Cow("cow#"+i);
		}
		c3.printCowInfo();
		c3.
		
	}

}
