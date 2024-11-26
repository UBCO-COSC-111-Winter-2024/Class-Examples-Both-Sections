
public class TestFarmV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cow c1 = new Cow("Robert Paulson", -10);
		//This should be a hungry cow -> stomach should be 0 and isFull should be false
		c1.getCowStatus();
		
		c1 = new Cow("Robert Paulson", 30000000);
		//This should be a full cow -> stomach should be 100 and isFull should be true
		c1.getCowStatus();
		
		c1 = new Cow("Robert Paulson", 1);
		//This should be a full cow -> stomach should be 1 and isFull should be false
		c1.getCowStatus();
		
		c1 = new Cow("Robert Paulson", 99);
		//This should be a full cow -> stomach should be 99 and isFull should be false
		c1.getCowStatus();
		
		c1 = new Cow("Robert Paulson", 100);
		//This should be a full cow -> stomach should be 100 and isFull should be true
		c1.getCowStatus();
		
		System.out.println("Protecting instance data with a setter (overfeed)");
		c1.setStomachContents(30000);
		c1.getCowStatus();
		
		System.out.println("Protecting instance data with a setter (underfeed - black hole in stomach");
		c1.setStomachContents(-2);
		c1.getCowStatus();
		System.out.println("The content level is: " + c1.getStomachContents());
		
		System.out.println("Protecting instance data with a setter (respectful feeding");
		c1.setStomachContents(50);
		c1.getCowStatus();
		
		System.out.println(c1);
		
	}

}
