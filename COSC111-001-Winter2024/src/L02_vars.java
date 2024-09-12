
public class L02_vars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double distance;
		
		float value = 10.65F;
		
		//this is a bad idea!  (not enough bytes in data type to store the 
		//whole number
		distance = 10.0000000000000000000000000000000000000000000005;
		
		System.out.println(distance);
		
		int x = (1/3);  //watch out
		
		distance = (1/3);  //watch out - we will come back to this a bit
		
		System.out.println(x);
		
		System.out.println(distance);

		
	}

}
