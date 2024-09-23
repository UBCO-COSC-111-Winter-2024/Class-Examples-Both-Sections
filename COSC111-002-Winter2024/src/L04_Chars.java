
public class L04_Chars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char c1 = 'A';
		
		System.out.println(c1);
		
		c1++;
		
		System.out.println(c1);
		
		System.out.printf("%c is numerically %d\n",c1,(int)c1);
		
		c1--;c1--;
		
		System.out.printf("%c is numerically %d\n",c1,(int)c1);
		
		c1 = 'a';
		//c1 -= 32;
		c1 -= ' ';
		System.out.printf("%c is numerically %d\n",c1,(int)c1);
		
		char num = '0';   //this is not the number 0!!!!!!!
		System.out.printf("%c is numerically %d\n",num,(int)num);
		
		char newNumber = '7';
		int numAsInt = newNumber - '0';

		System.out.printf("numerically %d\n",numAsInt);
		
		char num2 = 67;
		System.out.printf("%c is numerically %d\n",num2,(int)num2);

	}

}
