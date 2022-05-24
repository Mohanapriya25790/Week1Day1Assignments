package week1.day1;

public class Armstrong {

	public static void main(String[] args) {
		int inp = 157,orgNum,rem,result=0;
		 orgNum = inp;

	        while (orgNum != 0)
	        {
	            rem = orgNum % 10;
	            result += Math.pow(rem, 3);
	            orgNum/= 10;
	        }

	        if(result == inp)
	            System.out.println(inp + " is an Armstrong number.");
	        else
	            System.out.println(inp + " is not an Armstrong number.");

	}

}
