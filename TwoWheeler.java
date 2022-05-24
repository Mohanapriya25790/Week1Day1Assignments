package week1.day1;

public class TwoWheeler {
	int noOfWheels = 4;
	short noOfMirrors = 3;
	long chassisNumber = 9977665544123l;
	boolean isPunctured = true;
	String  bikeName = "suzukiAccess";
	double runningKm = 4567.89;

	public static void main(String[] args) {
		
		TwoWheeler mine = new TwoWheeler();

	
		System.out.println(mine.noOfWheels);		
        System.out.println(mine.noOfMirrors);
        System.out.println(mine.chassisNumber);
        System.out.println(mine.isPunctured);
        System.out.println(mine.bikeName);
        System.out.println(mine.runningKm);
	}

}
