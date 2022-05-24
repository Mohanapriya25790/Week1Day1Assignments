package week1.day1;

public class Car {
	public void applyBrake() {
		System.out.println("apply brakes");
	}
	public void applyGear() {
		System.out.println("apply gear");
	}
	public void switchonAc() {
		System.out.println("switch on AC");
	}
    public void applyAcclerate() {
	System.out.println("apply acclerate");
}
	public static void main(String[] args) {
		Car mycar = new Car();
		mycar.applyBrake();
		mycar.applyGear();
		mycar.switchonAc();
		mycar.applyAcclerate();
		
		
	}

}
