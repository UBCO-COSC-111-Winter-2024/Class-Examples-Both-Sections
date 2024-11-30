
public class TestArrayOfCircles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//this is creating an array of object references!!!
		Circle[] circleArray = new Circle[4];
		
		
		//we need to make sure that we initialize the array with our objects!!
		
		//Remember, for-each is only for access (reading) 
//		for (Circle c : circleArray)
//		{
//			c = new Circle(23.9, "red", false);
//		}
		for (int idx = 0; idx < circleArray.length ; idx++)
			circleArray[idx] = new Circle((23.9+idx), "red", false);
		
		//A - yes it works 
		//B - no way
		for (int idx = 0; idx < circleArray.length ; idx++)
			circleArray[idx].printInfo();
		
//		for (Circle c : circleArray)
//		{
//			c.printInfo();
//		}
	}

}
