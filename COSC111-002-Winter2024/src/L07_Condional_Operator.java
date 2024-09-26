import java.util.Scanner;

public class L07_Condional_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int num = in.nextInt();//read in an int
		
		
		//This is sooooo complicated but works....
		String str = ((num % 5) == 0 && (num % 2) == 0) ? "HiTwo HiFive " : ((num % 5) == 0 ? "HiFive" : ((num % 2) == 0)? "HiTwo" :"" ); 
		System.out.println(str);
		
	}

}
