package old;

public class RockGroupTshirt extends TShirt{
	
	String rockGroup; 

	public RockGroupTshirt(String color, String material, String size, double price, int quantity, String rockGroup) {
		super(color, material, size, price, quantity);

	}

	public String getRockGroup() {
		return rockGroup;
	}

	public void setRockGroup(String rockGroup) {
		this.rockGroup = rockGroup;
	}
}
