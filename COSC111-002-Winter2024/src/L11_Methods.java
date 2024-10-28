
public class L11_Methods {
	
	
	public static int daysInMonth(int month)
	{
		// return 30
		// return 31
		// return 28/29 (bonus)
		// else -1   ->done!!!
		
		switch(month)
		{
		
		case 9, 4, 6, 11:
		{
			return 30;
		}
		case 1, 3, 5, 7, 8, 10, 12:
		{
			return 31;
		}
		case 2:
		{
			return -1;
		}
		default:
			return -1;
		}
	}
//	public static int max(int num1, int num2) {
//		
//		int max = 0;
//		max = Math.max(num1, num2);
//		//Math.max(num1, num2);
//		return max;
//		
//		
//	}
	public static int max(int num1, double num2) {
		
		int max = 0;
		max = Math.max(num1, (int)num2);
		//Math.max(num1, num2);
		return max;
		
		
	}
	
	public static void p(String str)
	{
		System.out.println(str);
		return;			//this is optional with a void, but if you use it
						//it must return nothing!!!
	}
	
	public static int doSum(int start, int end)
	{
		int sum = 0;
		for (int i = start; i <= end; i++)
		{
			sum += i;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(max(10,3));
//		System.out.println(max(3,7));
//		System.out.println(max(-2,-5));
//		
//		System.out.println(max(3,7.5));
//		
//		p("" + max(3,12));
//		
		p("Print the sum!!");
		
		int sum = 0;
		
		//doSum(1,3);
		//p("" + sum); //watch out!
		
		sum = doSum(1,3);			//calls the method and then returns the
									//value to sum
		
		p("" + sum);
		
		
	}

}
