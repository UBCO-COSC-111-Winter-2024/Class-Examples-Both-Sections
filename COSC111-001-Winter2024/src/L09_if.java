
public class L09_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int idx = 0;
			for (idx = 0; idx < 5; idx += 2);
			{
				System.out.println(idx);
			}
			
//			System.out.print("The value of the idx is now: " + idx);
			
			//DON'T DO THIS!!! (But you can....)
//			for (int idx = 0; idx < 5; System.out.println(idx++))
//			{
//				System.out.println(idx);
//			}
		
//			int idx = 0;
//			for (; idx < 5; idx += 1)
//			{
//				System.out.println(idx);
//			}
//			//at the end of this loop, idx?
//			//idx == 5!!!
//			
//			
//			//make sure that you pay attention to your loop counter
//			//and re-initialize it!!!
//			idx = 0;
//			for (; idx < 5; idx += 1)
//			{
//				System.out.println("run 2" + idx);
//			}
//			
////			idx = 0;
////			for ( ; ; idx += 1)   //don't do this as it is missing our conditional expression!!
////			{
////				System.out.println("run 2" + idx);
////			}
//			
////			idx = 0;
////			for ( ; idx < 5 ; )   
////			{
////				 
////			}
//			
////			for(;;)
////				System.out.println("Hi");
////			
//			//same as
////			while(true)
////				System.out.println("Hi");

	}

}
