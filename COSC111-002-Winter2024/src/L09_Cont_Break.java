
public class L09_Cont_Break {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//		int count = 1;
//		
//		while (count < 10)
//		{
//			System.out.println(count);
//			if ((count % 5) == 0)
//				break;
//			count++;
//		}
		
//		count = 0;
//		
//		while (count < 10)
//		{	
//			count++;
//			if ((count % 2) == 0)
//				continue;   //remember, this will skip over the remaining statements
//			System.out.println(count);
//		}
		
		for (int i = 2; i< 10; i++)
		{
			if (i % 2 == 0) continue;
			System.out.println(i);
		}
	}
}
