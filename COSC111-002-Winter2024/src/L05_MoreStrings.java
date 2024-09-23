
public class L05_MoreStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "cat";
		String str2 = "dog";
		String str4 = "cat";
		String str3 = "cats are better than dogs....";
		String str5 = "     cats are better than dogs....";
		System.out.println(str1 == str2);  //don't do this unless you want to compare the addressses
		System.out.println(str1.compareTo(str2));		//false (not 0)
		System.out.println(str1.equals(str4));			//true	
		System.out.println(str3.startsWith(str1));		//true
		System.out.println(str5.startsWith(str1));		//
		System.out.println(str3.substring(21,25));		//true
		
		System.out.println(str3.indexOf("dogs"));		
		System.out.println(str3.indexOf("birds"));	
		
		//Extract out cat from str3
		int startCat = str3.indexOf("cats");
		int endCat = str3.indexOf(' ');
		String catStr = str3.substring(startCat,endCat);
		System.out.println(catStr);
		
		int startBetter = str3.indexOf("better");
		int endBetter = str3.indexOf(' ', startBetter);
		String betterStr = str3.substring(startBetter,endBetter);
		System.out.println(betterStr);
	}

}
