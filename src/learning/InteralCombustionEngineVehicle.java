package learning;

public class InteralCombustionEngineVehicle extends Vehicle {

	double kilometersPerLiter;
	double maxLitersInTank;
	double currentLitersInTank;

	public InteralCombustionEngineVehicle(String make, String model, double kilometersPerLiter, double maxLitersInTank,
			double currentLitersInTank) {
		super(make, model);

	}

	public double getKilometersPerLiter() {
		return kilometersPerLiter;
	}

	public void setKilometersPerLiter(double kilometersPerLiter) {
		this.kilometersPerLiter = kilometersPerLiter;
	}

	public double getMaxLitersInTank() {
		return maxLitersInTank;
	}

	public void setMaxLitersInTank(double maxLitersInTank) {
		this.maxLitersInTank = maxLitersInTank;
	}

	public double getCurrentLitersInTank() {
		return currentLitersInTank;
	}

	public void setCurrentLitersInTank(double currentLitersInTank) {
		this.currentLitersInTank = currentLitersInTank;
	}

	public void addGas(double litersOfGas) {
		double roomInTankLiters = this.maxLitersInTank - this.currentLitersInTank;
		// If they want to add more liters then there is room, set to max

		if (roomInTankLiters < litersOfGas) {
			this.currentLitersInTank = this.maxLitersInTank;
		} else {
			this.currentLitersInTank -= litersOfGas;
		}
	}

	public boolean drive(double kilometers) {
		this.currentLitersInTank -= (kilometers / this.kilometersPerLiter);
		if (this.currentLitersInTank < 0) {
			this.currentLitersInTank = 0;
		}
		return super.drive(kilometers);
	}
}
