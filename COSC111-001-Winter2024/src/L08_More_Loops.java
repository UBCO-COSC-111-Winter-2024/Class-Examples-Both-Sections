import java.util.Scanner;
public class L08_More_Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Enter a value ( 0 to exit");
		int value = in.nextInt();
		
		int sum = 0;
		
		while(value != 0)
		{
			sum += value;
			System.out.println("Enter a value ( 0 to exit");
			value = in.nextInt();
			
		}
		
		System.out.println("The sum is .... " + sum);
		
		
	}

}
