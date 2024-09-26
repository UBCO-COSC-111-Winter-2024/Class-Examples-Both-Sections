
public class L06_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 30;
		int y = 20;
		
//		
//		//one way statements
//		if (x < y)
//		{
//			System.out.println("x is less than y");
//			System.out.println("Yeah");
//		}
//		System.out.println("next");
//		
//		//two way
//		if (x < y)   // 30 < 20 ??
//		{
//			System.out.println("x is less than y");
//			System.out.println("Yeah");
//		}
//		else  
//		{
//			System.out.println("y is less than x");
//			System.out.println("Yeah");
//		}
//		System.out.println("next");
		
		x = 30; y =20;
		
		//this will cause no end of badness in your code
//		if (x < y); //if(x<y){};  watch out for this !!!! 
//		
//		{
//			System.out.println("x is less than y");
//			System.out.println("Yeah");
//		}
		
//		System.out.println("next");
	
	
	
		x = 10;

		if (x <= 10)
			System.out.print("A");
		else
			System.out.print("B");
		
		System.out.print("C");
		
		
		x = 10;

		//watch out for nesting levels!
		if (x <= 10){
			System.out.print("A");
		}
		else
		{
			if (x > 20)
			{
				System.out.print("B");
			}
		else {
			System.out.print("c");
			}
		}

		
		System.out.print("C");
		
		
		int num=12;
		
		if (num >= 8)
			System.out.println("A");
		else {
			if (num == 10)
				System.out.println("B");
			else
				System.out.println("C");
		}

	}
}
