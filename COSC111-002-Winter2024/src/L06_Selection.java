
public class L06_Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 9;
		int y = 12;

		if (x > y)
		{
			System.out.println("x is greater than y!");
			System.out.println("Yeah!");
		}
		System.out.println("The end....");  //this statement is after the if so
											//it will always get printed
		
		//Two way conditional
		
//		if (x > y) 
//		{
//			System.out.println("x is greater than y!");
//			System.out.println("Yeah!");
//		}else
//		{
//			System.out.println("The end....");  
//		}
//		
//		x = 19;
//		
//		if (x > y) 
//		{
//			System.out.println("x is greater than y!");
//			System.out.println("Yeah!");
//		} else {
//			System.out.println("The end....");
//			System.out.println("and this too");
//		}
//		System.out.println("This is after the if-else...");
		
		if (x > y); // if(x > y){}   ///watch out!
		{
			System.out.println("x is greater than y!");
			System.out.println("Yeah!");
		}
		System.out.println("The end....");  //this statement is after the if so
											//it will always get printed
		
		//example of really badly formatted code
		if (x == 9){System.out.println("Hi");} else System.out.println("Bye");
		
		//is the same as.... 

		if (x == 9) {
			System.out.println("Hi");
		} else
			System.out.println("Bye");
		
		
		//iClicker question
		
		int num = 12;
		
		if (num >= 8) {
			System.out.print("A");
		}
		
		if (num == 10) {
			System.out.print("B");
		}
		else {
			System.out.print("C");
		}
		
		x = 10;
		y = 20;
		if (x >= 5) {
			System.out.print("bigx ");
			if (y >= 10)
				System.out.print("bigy ");
		} else {
			if (x == 10 || y == 15)
				if (x < y && x != y)
					System.out.print("not equal");
		}


	}

}
