
public class SomeReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Major concepts:
		 * 	- Variable types -> width of each primitive type; what will 
		 * 				automatically widen (implicit casting); what happens
		 * 				with explicit casting (and how to do it).
		 * 				-Objects (String, Scanner) -> Object references
		 * 					-objects contain not only data but have methods
		 * 					associated with them!
		 * 				Strings:  
		 * 					charAt(idx)			//gives us a char at a given index
		 * 					substring(idx)		// cuts out string starting at idx until end
		 * 					substring(startIdx, endIdx) //remember end is exclusive
		 * 					length()			//length of string
		 * 					trim()				//removes extra white space at start/end
		 *					toLowerCase()
		 *					toUpperCase()
		 *					equals(String)
		 *					equalsIgnoreCase(String)
		 *					plus some others
		 *
		 * -output 
		 * 			System.out.println, print, printf
		 * -Handy character tricks
		 * 			-see below
		 * 
		 * -Static Classes -> Math, Character 
		 * 			-review what we covered in the notes 
		 * 
		 * -flow-control (if, if-else, switch)
		 */
		String str = new String("Today is Thrusday!!!!    ");
		
		System.out.println(str.charAt(2));   //third character
		
		// Let's remove the white space
		//str.trim();				//Remembr!!! Strings are immutable!!!!
		String str2 = str.trim();	//this creates a new strings with the white space removed!!
		
		//what about last character??
		int len = str2.length();			//returns the length of a string
		char lastChar = str2.charAt(len - 1);  //last character will always be len - 1
	
		System.out.printf("%c\n", lastChar);
		
		//want to trim out "Today"
		String str3 = str2.substring(0,4);  //index start at 0!
											//remember that the second idx is exclusive (not included)
		str3 = str2.substring(0,5);  
		System.out.println(str3);
		
		String str4 = "Today";
		
		//true or false?
		System.out.println(str4 == str3);	//what is this doing?  
											//it's comparing what's in the object ref variable
											//which is the address of the obj
		//To properly compare
		System.out.println(str4.equals(str3));		//T or F
		System.out.println(str4.equalsIgnoreCase(str3));
		
		//We also have compareTo
		System.out.println(str4.compareTo(str3));  //returns 0 if equal
		
		str3 = "today";
		//To properly compare
		System.out.println(str4.equals(str3));		//T or F
		System.out.println(str4.equalsIgnoreCase(str3));
		
		//We also have compareTo
		System.out.println(str4.compareTo(str3));  //returns 0 if equal
		
		//handy character tricks (primitive)
		char c = 'A';
		System.out.printf("char: %c numeric value %d\n", c, (int)c);
		
		c++;	//Handy trick #1 (goes to next letter)
		System.out.printf("char: %c numeric value %d\n", c, (int)c);
		c = (char)(c + 32);  //handy trick #2
		
		System.out.printf("char: %c numeric value %d\n", c, (int)c);

		c = '5';		//Is this the number 5???  It's the character 5!!		
		
		//coverting an ASCII number to the actual numeric value ('5' --> 5)
		
		//Handy trick #3
		int charVal = '5' - '0';
		System.out.printf("numeric value %d\n", charVal);
		
		
		//Math Class
		
		//Constants!!!
		final double VAL1 = Math.PI;			//Make sure to use constants
		double val2 = Math.E;
		
		System.out.println(VAL1 + "  " + val2);
		
		Math.pow(10, 2);	//10^2 --> double
		
		double randVal = Math.random();		// [0,1)
		
		//so lets generate 19 random number between 55 and 73 inclusive
		
		int val4 = (55 + (int)(Math.random()*19));
		//int val4 = (int)(55 + Math.random()*19);  //same-same
		//  Math.random()*19 -- > 0 - > 18.99999999
		// then we truncate --> 0 -> 18
		
		System.out.println("Random value [55,73]: " + val4);
		
		//let's do random letters
		//we need know the position of 'A' --> 65 (we have 26 letters)
		//if 'A' is idx 0, 'Z' is idx 25 (so we need to generated a random 
		//number between and 25 and then add it to 'A'
	
		//char randChar = (char)('A' + (Math.random()*26));
		char randChar = (char)('A' + (char)(Math.random()*26));
		
		System.out.println(randChar);
		
		//randomize upper/lowercase
		
		int coin = (int)(Math.random()*2);
		
		if (coin == 1)
			randChar = Character.toLowerCase(randChar);
		
		//nice problem!
		randChar = ((int)(Math.random()*2) == 0)? Character.toUpperCase(randChar): Character.toLowerCase(randChar);
		
		System.out.println(randChar);
		
		//if - else
		
		if (coin == 0)
		{
			System.out.println("The coin flip was heads");
			System.out.println("The value is: " + randChar);
		}
		else
		{
			System.out.println("The coin flip was tails");
			System.out.println("The value is: " + randChar);
		}

//don't do this!!
//		if (coin == 0);		//watch out for this!!!!!
//		{
//			System.out.println("The coin flip was heads");
//			System.out.println("The value is: " + randChar);
//		}
//		else
//		{
//			System.out.println("The coin flip was tails");
//			System.out.println("The value is: " + randChar);
//		}
		
//		if (coin == 0)
//		{
//			System.out.println("The coin flip was heads");
//			System.out.println("The value is: " + randChar);
//		}
//		else (coin == 1)			//don't do this!!!!
//		{
//			System.out.println("The coin flip was tails");
//			System.out.println("The value is: " + randChar);
//		}
		
		switch (coin)
		{
		case 0:
			System.out.println("The coin flip was heads");
			break;
		case 1:
			System.out.println("The coin flip was tails");
			break;
		default:
		}
		System.out.println("The value is: " + randChar);


	}

}
