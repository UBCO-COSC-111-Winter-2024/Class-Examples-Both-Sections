import java.util.Scanner;

public class L08_DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int sum = 0;
		int value=0;
		
		do
		{
			System.out.println("Enter a value ( 0 to exit");
			value = in.nextInt();
			sum += value;
			
		}while(value != 0);
	}

}
