package OOp.practice.Concepts;

public class Car extends Vehicle {
	private boolean powerSteering = false;
	private boolean ledScreen = true;

	public Car(String name, String color, String model, String company, String engine, boolean powerSteering,
			boolean ledScreen) {
		super(name, color, model, company, engine);
		this.powerSteering = powerSteering;
		this.ledScreen = ledScreen;
	}

	public void setPowerSteering(boolean powerSteering) {
		this.powerSteering = powerSteering;
	}

	public void setLedScreen(boolean ledScreen) {
		this.ledScreen = ledScreen;
	}

	public String getName() {

		return "The Name of This Car is: " + super.getName();
	}

	public boolean getPowerSteering() {
		return this.powerSteering;
	}

	public boolean getLedScreen() {
		return this.ledScreen;
	}

	public String getInfo() {
		return "This is a Car!";
	}
}
