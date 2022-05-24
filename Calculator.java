package week1.day1;

public class Calculator {
	
	
	public int sum(int a,int b) 
	{
	int sumresult = a+b;
	return sumresult;
	}
	public double sub(double n1,double n2)
	{
    double result = n1-n2;
    return result;
    	}
	public float mul(float x,float y) {
		float product = x*y;
		return product;
	}
	public static void main(String[] args)
	{
		Calculator calc=new Calculator();
		int add = calc.sum(4,7);
		double subr= calc.sub(23.4,12.6);
		float mult = calc.mul(8, 9);
		System.out.println(add);
		System.out.println(subr);
		System.out.println(mult);
		
    
	}

}
