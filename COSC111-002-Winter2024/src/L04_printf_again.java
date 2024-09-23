
public class L04_printf_again {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;
		System.out.printf("This is a number %d", x);
		
		Math.cos(x);
		
		System.out.printf("Sqrt of %d is %5.2f\n", x, Math.sqrt(x));
		
		int a, b, c;
		a =10;
		b = 20;
		c = 3;
		
		//option 1
		int min = Math.min(a, b);
		min = Math.min(min, c);
		
		// option 2 
		min = Math.min(a, Math.min(b, c));
		
		System.out.println(min);
		
	//	double num = Math.random();
		//0 -> 20
		int num = (int)(Math.random() * 21); //it will never generate 21, but really really really close (20.9999999)
		
		System.out.println(num);
	}

}
