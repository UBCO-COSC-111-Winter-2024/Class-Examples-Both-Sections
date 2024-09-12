
public class L03_Math_Stuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int x = 5;
//		int y = 10;
//		System.out.println(5/10);  //watch out!!!!!  ---> 0
		
//		double x = 5;
//		int y = 10;
//		System.out.println(x/y);   //5/10   --->???
		
//		int x = 5;
//		double y = 10;
//		System.out.println(x/y);  //?
		
		int x = 5;
		int y = 10;
		System.out.println(x/y*1.0);  //?  -->> 0.0
		
		x = 5;
		y = 10;
		System.out.println(1.0*x/y);  //?  -->> 0.5
		
		System.out.println( (x/y) + 27.5);
		
		x++;   ///++x;  <--- be careful
		
		System.out.println(1.0*x/y);  //?  -->> 0.5

	}

}
