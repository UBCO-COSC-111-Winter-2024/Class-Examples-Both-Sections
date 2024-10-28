
public class L09_Break_Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int count = 0;
//		while(count < 10)
//		{
//			System.out.println(count);
//			if (count == 7) break;
//			count++;
//		}
//		System.out.println("The end!!");
		
//		int count = 0;
//		while(count < 10)
//		{
//			System.out.println(count);
//			if (count == 7) continue;   //watch out for this!!!!
//			count++;
//		}
//		System.out.println("The end!!");
		
//		int count = 0;
//		for (count = 0; count < 10; count ++)
//		{
//			if (count == 7) continue;   
//			System.out.println(count);
//		}
		

		int count = 0;
		for (count = 0; count < 10; count ++)
		{

			int count2 = 0;
			for (count2 = 0; count2 < 10; count2 ++)
			{
				if (count2 == 5) continue;
				System.out.print(count*count2 + " ");
			}
			System.out.println();
		}
	}

}
