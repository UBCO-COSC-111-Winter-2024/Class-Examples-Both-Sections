
public class L11_Methods {
	
	public static int doSomething()
	{
		int x = (int)(Math.random()*10);
		
		return x;   //this forces the method to exit
		
		//this code is unreachable!!!
		//p("" + x);
		
		
	}
	public static int findMax(int num1, int num2)
	{
		int maxValue = Math.max(num1, num2);
		return maxValue;
	}
	
	public static void p(String str)
	{
		System.out.println(str);
		return;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p("" + findMax(1,5));
		p("" + findMax(6,25));
		p("" + findMax(1,-2));
		
		int x = 0;
		
		//remember!!! assign the value to a variable 
		x = findMax(1,5);   //make sure the types are compatible
		p("" + x);
		
		//x = findMax(1,3,5);
	}

}
