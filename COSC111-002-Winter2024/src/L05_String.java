import java.util.Scanner;

public class L05_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str;
//		
//		str = "Hi";  //assignment
		
		String str = "Hi everyone         12";   //spaces count in strings !!!
		
//		String str = new String();   //like we did with the scanner
//									// ""
		
		System.out.println(str);
		System.out.println(str.length());
		
		String str1 = "Dog";
		String str2 = str1;
		
		System.out.println(str1);
		System.out.println(str2);
		
		str1 = "cat";  //new or changed?
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1.length());
		str1 = "lazy " + str1;		//what's happening here?? ->  a new object
		System.out.println(str1.length());
		System.out.println(str1);
		
		str1 = "      " + str1 + " some more whitespace      ";
		System.out.println(str1);
//		String str3 = str1.trim();
//		System.out.println(str3);
		
		str1 = str1.trim();
		System.out.println(str1);
		
		int lastCharIndex = str1.length()-1;
		System.out.println("The last character is " + str1.charAt(lastCharIndex));
		System.out.println("The last character is " + str1.charAt(str1.length()-1));

		//what happens here? --> this will cause a index out of bounds exception 
	//	System.out.println("The last character is " + str1.charAt(str1.length()));

		String str3 = "fish";
		
		String str4 = str1.concat(str3);
		
		System.out.println(str4);
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter some characters....");
		
		String str5 = in.nextLine();
		
		System.out.println(str5);
		
		System.out.printf("The first character is %c\n", str5.charAt(0));
	}

}
