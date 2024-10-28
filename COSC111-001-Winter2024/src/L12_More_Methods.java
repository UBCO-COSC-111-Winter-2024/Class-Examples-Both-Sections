
public class L12_More_Methods {
	
	public static void p(String str)
	{
		System.out.println(str);
		return;
	}
	
	
	
//	public static int max(double num1, int num2)
//	{ 	
//		int max = 0;
//		max = Math.max((int)num1, num2);
//		//Math.max(num1, num2);
//		return max;
//	}
	
	public static int max(int num1, double num2)
	{ 	
		int max = 0;
		max = Math.max(num1, (int)num2);
		//Math.max(num1, num2);
		return max;
	}
	
	public static int max(double num1, double num2)
	{ 	
		int max = 0;
		max = Math.max((int)num1, (int)num2);
		//Math.max(num1, num2);
		return max;
	}

	//	Important!!! The method signature does NOT depend on the return type
//	public static double max(double num1, double num2)
//	{ 	
//		int max = 0;
//		max = Math.max((int)num1, (int)num2);
//		//Math.max(num1, num2);
//		return (double)max;
//	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int maxVal = max(3.0,4);

	}

}
