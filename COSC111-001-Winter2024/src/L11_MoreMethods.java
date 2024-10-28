
public class L11_MoreMethods {

	
	public static int daysInMonth(int month)
	{
		switch(month)
		{
		case 9, 4, 6 , 11 : return 30;
		case 1, 3, 5, 7, 8, 12, 10: return 31;
		case 2: return 28;
		default: return -1;
		}
		
	}
	public static int addOne(int x)
	{
		x++;
		return x;
	}
	
	public static void main(String[] args) {
		
		int x = 1;
		addOne(x);
		System.out.println(x);  //prints 1
		
		x = addOne(x);
		System.out.println(x);
	}
}
