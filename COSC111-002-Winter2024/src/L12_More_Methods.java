
public class L12_More_Methods {
	
	public static void p(String str)
	{
		System.out.println(str);
		return;
	}
	
	public static void p(int num)
	{
		System.out.println(num);
		return;
	}
	
	public static int max(int num1, double num2)
	{ 	
		int max = 0;
		max = Math.max(num1, (int)num2);
		//Math.max(num1, num2);
		return max;
	}
	
	
	public static int max(double num1, int num2)
	{ 	
		int max = 0;
		max = Math.max((int)num1, num2);
		//Math.max(num1, num2);
		return max;
	}
	
	public static void m(int x) {
		p("A : " + x);
	}
	public static void m(double x) {
		p("B : " + x);
	}
	public static void m(String x) {
		p("C : " + x);
	}

	public static void main(String[] args) {
//		p(max(1, 5.0));   //this works!
//		
//		p(max(1,2));
		
		//m('a');  //this is not a string!!!!
		
		int x = 62;
		m(x);
//		for (int x = 0; x < 10; x++)
//			m(x);
	}
}
