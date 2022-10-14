package old;

public class TShirt {

	private String color;
	private String size;
	private String material;
	private double price;
	private int quantity;

	public TShirt(String color, String material, String size, double price, int quantity) {
		this.color = color;
		this.size = size;
		this.material = material;
		setPrice(price);
		setQuantity(quantity);
	}

	public String getColor() {
		return color;
	}

	public String getSize() {
		return size;
	}

	public String getMaterial() {
		return material;
	}

	public double getPrice() {
		return price * quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setSize(String size) {
		if (size.equalsIgnoreCase("xs") || size.equalsIgnoreCase("s") || size.equalsIgnoreCase("m")
				|| size.equalsIgnoreCase("l") || size.equalsIgnoreCase("XL")) {
			this.size = size;
		} else {
			System.out.println("That size is not available");
			;
		}
	}

	public void setPrice(double price) {
		if (price < 0) {
			this.price = 0;
		} else {
			this.price = price;
		}
	}

	public void setQuantity(int quantity) {
		if (quantity < 0) {
			this.quantity = 0;
		} else {
			this.quantity = quantity;
		}
	}

}
