package old;

public class Dresser {

	private int numberOfDrawers;
	private String color;
	private double height;
	
	

	public Dresser(int numberOfDrawers, String color, double height) {
		super();
		this.numberOfDrawers = numberOfDrawers;
		this.color = color;
		this.height = height;
	}

	public void setColor(String theColor) {
		this.color = theColor;
	}

	public void setDrawers(int theDrawers) {
		this.numberOfDrawers = theDrawers;
	}

	public void setHeight(double theHeight) {
		this.height = theHeight;
	}

	public String getColor() {
		return this.color;
	}

	public int getDrawers() {
		return this.numberOfDrawers;
	}

	public double getHeight() {
		return this.height;
	}
}
