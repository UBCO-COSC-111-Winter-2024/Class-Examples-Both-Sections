
public class BetterCircle extends Circle {
	
	
//	public BetterCircle()
//	{
//		//There is an implicit call to super() <-------  IMPORTANT!!!!!
//		//super(); 
//		super(10);
//		//how can I call my parent's constructor?
//		//super(13.4,"red", true);
//		
//	}

	
	public String toString()
	{
				//this invokes the toString from our parent (advanced)
		return super.toString() + " better circle with radius of " + this.getRadius();
		//to access my grandparent
		//return super.suptoString();
	}

}
