
public class L08_Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		//while (count < 10);   //DON'T DO THIS!!!!!!
		while (count < 10)
		{
			//System.out.print(count + " ");
			System.out.print("*");
			count ++;	//this is super super super important!!
		}
		
		
		//watch out for this too!!!
		/*
		while (count < 10)
			System.out.print(count + " ");
		count++;	//this is super super super important!!
		*/
		
		count = 10;
		//while (count < 10);   //DON'T DO THIS!!!!!!
		while (count > 0)
		{
			//System.out.print(count + " ");
			System.out.println(count);
			count--;	//this is super super super important!!
		}
		
		
		//even numbers
		count = 0;
		//while (count < 10);   //DON'T DO THIS!!!!!!
		while (count < 11)
		{
			//System.out.print(count + " ");
			if (count % 2 == 0) //only if it is even
				System.out.println(count);
			count ++;	//this is super super super important!!
		}
		
		count = 0;
		//while (count < 10);   //DON'T DO THIS!!!!!!
		while (count < 11)
		{
			//System.out.print(count + " ");
			
			System.out.println(count);
			count += 2;	//this is super super super important!!
		}
	}

}
