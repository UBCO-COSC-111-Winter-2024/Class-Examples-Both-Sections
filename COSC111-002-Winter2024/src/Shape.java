
public class Shape {

	private String colour;
	private boolean isFilled;
	
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public boolean isFilled() {
		return isFilled;
	}
	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}
	
	public String toString()
	{
		return "colour: " + this.colour + ", isFilled is " + this.isFilled;
	}
	
}
