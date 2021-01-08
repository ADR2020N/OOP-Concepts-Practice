package OOp.practice.Concepts;

public class Test_Main {

	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle();
		vehicle1.setName("City");
		System.out.println(vehicle1.getName());
		System.out.println(vehicle1.count);

		Vehicle vehicle2 = new Vehicle("Civic", "Black", "2015", "Honda", "801");
		vehicle2.setmodel("2015");
		vehicle2.setcompany("Toyota");
		vehicle2.setcolor("Green");
		System.out.println(vehicle2.getName() + " " + vehicle2.getmodel() + " " + vehicle2.getcolor() + " "
				+ vehicle2.getcompany());
		System.out.println("Speed= " + vehicle2.getSpeed());
		System.out.println(vehicle1.count);

		System.out.println(Vehicle.getVehicle());

		Car car1 = new Car("Civic", "Black", "2015", "Honda", "801", true, false);
		System.out.println(car1.getLedScreen());
		System.out.println(car1.getPowerSteering());
		System.out.println(car1.getName());

		Vehicle vehicle4 = new Vehicle("Civic", "Black", "2015", "Honda", "801");
		System.out.println(vehicle4.getInfo());

		Vehicle vehicle = new Car("Civic", "Black", "2015", "Honda", "801", true, false);
		System.out.println(vehicle2.getInfo());

		Vehicle vehicle3 = new Bike("Civic", "Black", "2015", "Honda", "801", true);
		System.out.println(vehicle3.getInfo());

	}

}
