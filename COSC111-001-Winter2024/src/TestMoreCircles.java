
public class TestMoreCircles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape.printNumberOfObjects();

		
		Circle c = new Circle();

		c.setName("Bob");
		
		
		//this should call the Circle
		c.confusingCall(10.3);
		
		//This will be the `best' match on the parent's 
		//version of confusingCall
		c.confusingCall(10);
		
		Circle c2 = new Circle();
		
		Shape.printNumberOfObjects();
		Circle.printNumberOfObjects();
		

	}

}
