import java.util.Arrays;

public class SomeProblems {
	
	public static int[] countLetterFreq(String str)
	{
		int[] freq = new int[26];			//digits 0 -> 9

		for (int idx = 0; idx < str.length(); idx++)
		{	//this idx is the position of the digit in the oringal string
			//get the char
			char c = str.charAt(idx);
			if (Character.isLetter(c))
			{
				//ie. we need to take '0' and make it index 0 .....
				// '0' - '0' => 0
				// Here i is the value of a digit in the freq array 
		//		c = Character.toLowerCase(c);			//makes it lowercase
		//		int i = c - 'a';		//this is the index of my digit
				// or make is upper case
				c = Character.toUpperCase(c);			//makes it lowercase
				int i = c - 'A\';		//this is the index of my digit
				freq[i] ++;				// increase the count by 1
			}
				
		}
		
		return freq;
	}
	

	public static int[] countDigitFreqV1(String str)
	{
		int[] freq = new int[10];			//digits 0 -> 9

		for (int idx = 0; idx < str.length(); idx++)
		{	//this idx is the position of the digit in the oringal string
			//get the char
			char c = str.charAt(idx);
			if (Character.isDigit(c))
			{
				//ie. we need to take '0' and make it index 0 .....
				// '0' - '0' => 0
				// Here i is the value of a digit in the freq array 
				int i = c - '0';		//this is the index of my digit
				freq[i] ++;				// increase the count by 1
			}
				
		}
		
		return freq;
	}
	
	public static int[] countDigitFreqV2(String str)
	{
		int[] freq = new int[10];			//digits 0 -> 9

		for (char c : str.toCharArray())
		{
			if (Character.isDigit(c))
			{	
				int i = c - '0';		//this is the index of my digit
				freq[i] ++;	
			}
		}
		
		return freq;
	}
	
	public static int[] countDigitFreqV3(String str)
	{
		int[] freq = new int[10];			//digits 0 -> 9

		int idx = 0;
		while(idx < str.length())
		{
			char c = str.charAt(idx);
			if (Character.isDigit(c))
			{
				//ie. we need to take '0' and make it index 0 .....
				// '0' - '0' => 0
				// Here i is the value of a digit in the freq array 
				int i = c - '0';		//this is the index of my digit
				freq[i] ++;				// increase the count by 1
			}
			idx ++;
		}
		
		return freq;
	}
	
	public static int[] countDigitFreqV4(String str)
	{
		int[] freq = new int[10];			//digits 0 -> 9

		int idx = 0;
		//check length
		if (str.length() > 0)
		{
			do
			{
				char c = str.charAt(idx);
				if (Character.isDigit(c))
				{
					//ie. we need to take '0' and make it index 0 .....
					// '0' - '0' => 0
					// Here i is the value of a digit in the freq array 
					int i = c - '0';		//this is the index of my digit
					freq[i] ++;				// increase the count by 1
				}
				idx ++;
			}while (idx < str.length());
			
		}
		
		return freq;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Count the frequency of each digit in a string AND print results!!
		
		//ie String num = "1sdf4443362223456767787";
		
		//Need a loop -> need to access each character in the String (use .charAt(i))
		//we could use:
		//			-for loop 
		// 			-while loop (yuck here)
		//			-for each (you don't have to worry about indexes BUT need to make is a char[]
		//					AND you don't have to worry about index OOB (doesn't change the original)
		
		
		//  need to create something to store the frequency of each digit --> create an int array
		//  where each index is the count of that digit!
		
		
		String num = "1sdf4443362aa2234567677a87zzyk";
		
		
		
		System.out.println(Arrays.toString(countDigitFreqV1(num)));
		System.out.println(Arrays.toString(countDigitFreqV2(num)));
		System.out.println(Arrays.toString(countDigitFreqV3(num)));
		System.out.println(Arrays.toString(countDigitFreqV4("")));
		System.out.println(Arrays.toString(countDigitFreqV4(num)));
		

		System.out.println(Arrays.toString(countLetterFreq(num)));
		
		for (char c = 0; c < 256 ; c++)
			System.out.println(c + " " + (int)c);
	}

}
