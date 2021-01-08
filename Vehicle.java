package OOp.practice.Concepts;

public class Vehicle {

	private String name = "";
	private String color = "";
	private String model = "";
	private String company = "";
	private String engine = "800";
	public static int count = 0;

	public Vehicle() {
		count++;
	}

	public Vehicle(String name, String color, String model, String company, String engine) {
		this.name = name;
		this.color = color;
		this.model = model;
		this.company = company;
		this.engine = engine;
		count++;

	}

	public void setName(String name) {
		this.name = name;
	}

	public void setcolor(String color) {
		this.color = color;
	}

	public void setmodel(String model) {
		this.model = model;
	}

	public void setcompany(String company) {
		this.company = company;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getName() {
		return this.name;
	}

	public String getcolor() {
		return this.color;
	}

	public String getmodel() {
		return this.model;
	}

	public String getcompany() {
		return this.company;
	}

	private String getEngine() {
		return this.engine;
	}

	public int getSpeed() {
		String a = getEngine();
		if (a == "800") {
			return 90;
		} else {
			return 120;
		}
	}

	public String getInfo() {
		return "This is a Vehicle!";
	}

	public static String getVehicle() {
		return "You have set thae color of Vehicle";
	}

}
