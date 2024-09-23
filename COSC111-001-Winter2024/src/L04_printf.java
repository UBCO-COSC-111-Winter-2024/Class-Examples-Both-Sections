
public class L04_printf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 123456789; 
		int y = 20;
		double z = 123456789.987654321;
		
		System.out.printf("x = %5d, y = %d, z = %5.2f\n",x, y, z);
		String str = "short!";
		System.out.printf("%10s\n", str);   // don't forget the CR (\n)
		
		int w = 1234;
		
		System.out.printf("w = %-10d value\n", w);
		
		//System.out.printf("w = %10d value\n" + w);
		
		System.out.printf("w = value\n" + w);  //be careful!
	}

}
