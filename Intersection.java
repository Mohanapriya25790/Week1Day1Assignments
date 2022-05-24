package week1.day1;

public class Intersection {

	public static void main(String[] args) {
		int[] a= {3,2,11,4,6,7};
		int[] b= {1,2,8,4,9,7};
		int length= a.length;
		int length1=b.length;
		for(int i=0;i<=length-1;i++) {
			for(int j=0;j<=length1-1;j++) {
				if(a[i]==b[j]) {
					System.out.println(a[i]);
				}
			}
		}

	}

}
