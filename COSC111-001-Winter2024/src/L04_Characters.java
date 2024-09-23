
public class L04_Characters {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'A';
		System.out.println((int)c);	
		
		c++;
		System.out.println(c);	
		c += 32;
		System.out.println(c);	
		
		c = '0';   // is this the number 0?????
		System.out.println((int)c);	
		
		c = '6';   // how to convert to actually be 1?
		
		int num = (c -'0');		
		
		System.out.println(num);
		
		//won't work as this is a string not a char!
		//char nextNum = 'HI';
				
	}
}
