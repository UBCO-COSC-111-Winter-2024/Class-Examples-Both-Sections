import java.util.Scanner;

public class L06_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer!");
		
		int num = in.nextInt();
		
//		if (num % 5 == 0)
//			System.out.print("HiFive ");
//		
//		if (num % 2 == 0)
//			System.out.print("HiEven");
//		
		if ((num % 5 == 0) && (num % 2 == 0))
			System.out.print("HiFive HiEven");
		else
		{
			if (num % 5 == 0)
				System.out.print("HiFive ");
			if (num % 2 == 0)
				System.out.print("HiEven ");
		}
	}

}
