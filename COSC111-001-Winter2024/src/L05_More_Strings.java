import java.util.Scanner;

public class L05_More_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I like dogs!";
		
		System.out.println(str.length());
		
		//first character
		System.out.println(str.charAt(0));
		
		//last character!
		int len = str.length();
		//to access the last character in the string
		//use len - 1 
		System.out.println(str.charAt(len-1));
		
		//don't do this!
		//System.out.println(str.charAt(-3));
		str.toUpperCase();
		System.out.println(str.toUpperCase());
		System.out.println(str);
		str = str.toUpperCase();
		System.out.println(str);
		
		str = "       " + str + "    !";
		System.out.println(str);
		System.out.println(str.trim());
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a character!");
		String inStr = in.nextLine();
		
//		char c = inStr.charAt(0);  //this gives me the first character
//		System.out.println("The first char is " + c);
		
		
		String str1 = "cat";
		String str2 = "dog";
		String str3 = "CAT";
		
		System.out.println(str1==str2);   //what is this doing??
		//DON'T DO THIS!!!!!
		
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equalsIgnoreCase(str3));
		
		String str4 = "dogs are better than cats";
		
		//checks to see if a string starts with a specific sting
		
		System.out.println(str4.startsWith("dog"));
		
		System.out.println(str4.startsWith("Dog"));
		
		System.out.println(str4.endsWith("cats"));
		
		str4 = "small dogs are better than cats or big dogs";
		
		System.out.println(str4.indexOf("dogs"));
		
		int firstDog = str4.indexOf("dogs");
		System.out.println(str4.indexOf("dogs", firstDog+1));
		
		String str5 = "Geo McRuffRuff";
		
		int space = str5.indexOf(' ');  //assuming just one space
		String first = str5.substring(0,space);
		String last = str5.substring(space+1);  //start 1 past the space
		System.out.println(first);
		System.out.println(last);
		
		
		//IMPORTANT!  Remember how types can be widened
		//int x = Integer.parseInt("34.33");   //there is no trucation!! -> must be compatible
		//System.out.println(x);

		double y = Double.parseDouble("3");
		System.out.println(y);

	}

}
