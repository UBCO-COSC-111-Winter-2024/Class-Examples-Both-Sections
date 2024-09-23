
public class L03_inc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		
		x++;
		System.out.println(x);   //should be 11
		
		++x;
		System.out.println(x);   //should be 12
		
		//what does this print out?
		System.out.println(x++ + " " + ++x);
		//Option 1 -> 12 14  << correct
		//Option 2 -> 13 14 
		
		System.out.println(++x + " " + x++);
		//option 1 -> 15 15
		System.out.println(x); // 16
		
		System.out.println(); 
		
		double y = x;   // this is just fine (int fits in double)
		
		x = (int)3.5;   //loss of precision
		
		x = (int)(5/2.0);
		
		double sum = 0;
		sum += 10; 	//--> sum = sum + 10;
		
		sum += (0.4 + 4.5);  // sum = sum + .4 + 4.5;
		
		System.out.println(sum);
	}

}
