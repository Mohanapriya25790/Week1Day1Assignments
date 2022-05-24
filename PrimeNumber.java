package week1.day1;



public class PrimeNumber {

	public static void main(String[] args) {
		int input=15;
		int i;
		boolean flag =false;
		
		for(i=1;i<=input/2;i++) {
			if(input ==1 ||input ==0)
			{
				System.out.println(input +" is a prime number");
			}
			else
			{
			if(input%i==0) 
			{
				System.out.println(input +" is not a prime number");
				flag=true;
			break;
			
			}else {
				flag=false;
				System.out.println(input +" is a prime number");
				break;
				
			}
		
		
	}
		}
	}
}

