
public class L12_Count_Stuff {

	public static int countLetters(String str)
	{
		int count =0;
		for(int idx = 0; idx < str.length();idx++)
		{
			if (Character.isLetter(str.charAt(idx)))
				count ++;
		}
		return count;
	}
	
	public static int countDigits(String str)
	{
		int count =0;
		for(int idx = 0; idx < str.length();idx++)
		{
			if (Character.isDigit(str.charAt(idx)))
				count ++;
		}
		return count;
	}
	
	public static int countNonLetterOrDigit(String str)
	{
		int count =0;
		for(int idx = 0; idx < str.length();idx++)
		{
			if (!Character.isLetterOrDigit(str.charAt(idx)))
				count ++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testString = "r0000000f!!!!!";
		
		System.out.println(countLetters(testString));
		System.out.println(countDigits(testString));
		System.out.println(countNonLetterOrDigit(testString));
		
	}

}
