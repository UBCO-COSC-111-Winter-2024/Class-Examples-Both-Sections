
public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		//should be a circle with r = 10;
		c.printInfo();
		
		c = new Circle(-1);
		//should be a circle with r = 0;
		c.printInfo();
		
		c = new Circle(0);
		//should be a circle with r = 0;
		c.printInfo();

	}

}
