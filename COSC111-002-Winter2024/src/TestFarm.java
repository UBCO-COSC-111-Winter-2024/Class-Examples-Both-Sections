
public class TestFarm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Farmer farmer1 = new Farmer();			//create an instance of our farmere
		Farmer farmer2 = new Farmer();
		
		//how do I set the name for joe?
		farmer1.name = "Joe";
		farmer1.weight = 100;
		farmer1.x = 10;
		farmer1.y = 20;
		
		System.out.println("Name : " + farmer1.name);
		System.out.println("Name : " + farmer2.name);
		
		farmer2.name = "Sally";
		
		System.out.println("Name : " + farmer1.name);
		System.out.println("Name : " + farmer2.name);
		
		System.out.println(farmer1);
		System.out.println(farmer2);
		
//		Cow c1 = new Cow();   //This calls the default constructor --> watch out !!1
		Cow c1 = new Cow("Raplh", 0, 0);  //these are using the new constructors///
//		Cow c2 = new Cow();
		Cow c2 = new Cow("Sally", -10, 10);
		//c1.nickname = "bobby";
		
		Cow c3 = new Cow("Bill");
		

		
		//c2.nickname = "bessy";
		
		c1.stomach = 0;
		c1.isFull = false;
		
		//What should get printed out??
		System.out.println("Our cow....");
		System.out.println(c1.nickname);
		System.out.println(c1.stomach);
		System.out.println(c1.isFull);
		
		System.out.println(c3.nickname);
		
//		c1.eat();
//		System.out.println(c1.stomach);
//		c1.eat();
//		System.out.println(c1.stomach);
//		c1.eat();
//		System.out.println(c1.stomach);
//		c1.eat();
//		System.out.println(c1.stomach);
//		c1.eat();
//		System.out.println(c1.stomach);
//		c1.eat();
//		System.out.println(c1.stomach);
//		c1.eat();
//		System.out.println(c1.stomach);
		
//		while(!c1.isFull)
//		{
//			c1.eat();
//			System.out.println(c1.stomach);
//		}
//		
//		c1.getPosition();
//		c1.hover();
//		
//		c2.hover();
//		c2.hover();
//		c1.hover();
//		
//		c2.say("moo!");
//		c1.say("moo!");
//		
//		c2.say();
//		
//		c1.digest();
//		System.out.println(c1.stomach);
//		c1.eat();
//		System.out.println(c1.stomach);
//		c1.digest();
//
//		c1.drop();
//		
//		while (c1.z < 15)
//		{
//			c1.hover();
//		}
//		
//		c1.drop();
		


	}

}
