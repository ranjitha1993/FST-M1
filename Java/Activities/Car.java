package Activities;

public class Car {
	String color;
	String trans;
	int make;
	int tyres;
	int doors;

	public Car() {

		this.tyres = 4;
		this.doors = 4;
	}

	public void displayChar() {
		System.out.println("Car Details:");
		System.out.println("Color: " + color);
		System.out.println("Transmission: " + trans);
		System.out.println("Make: " + make);
		System.out.println("Tyres: " + tyres);
		System.out.println("Doors: " + doors);
	}

	public void acc() {
		System.out.println("Car is moving forward");
	}

	public void brake() {
		System.out.println("Car has stopped");
	}

}