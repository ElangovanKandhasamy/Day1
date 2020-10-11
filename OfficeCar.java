package week1.day1;

import org.openxmlformats.schemas.drawingml.x2006.main.STTextAutonumberScheme;

public class OfficeCar {
	long numberLong = 3243432444444444444L;
	double numberDouble = 3132123.512;
	float numberflaot = 3132123.512f;
    String fuel1 = "p";
	boolean onoff = true;

	public void drive_Car() {
		char fuel = 'p';
		System.out.println("Driving");
		System.out.println("fuel1");
		System.out.println(fuel);
	}

	public void applyBreak() { // TODO Auto-generated method stub
		System.out.println("Applying break");
		System.out.println("fuel1");
		System.out.println("fuel");
	}

	public static void main(String[] args) {
		OfficeCar status = new OfficeCar();
		status.applyBreak();
		status.drive_Car();

	}
}
