import java.util.Scanner;

public class L08_Checking_User_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int num = 0;
		
		do
		{
			System.out.println("Enter a number between 0 and 10:");
			num = in.nextInt();
		}while((num<0) | (num > 10));
		
		System.out.println(num);
		
		in.close();
		
	}	

}
