
public class L05_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1;
		
		//str = "cat";
		str1 = new String("cat");			//more formal
		
		String str2 = new String("dog");
		System.out.println(str1);
		System.out.println(str2);
		
		str2 = str1;
		
		System.out.println(str1);
		System.out.println(str2);
		
		str1 = "big dog";
		System.out.println(str1.length());
		System.out.println(str2);
		
		
	}

}
