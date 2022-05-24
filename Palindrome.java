package week1.day1;

public class Palindrome {

	public static void main(String[] args) {
		
    String a="madam";
    String rev="";
    int length=a.length();
    
    for(int i=length;i>=length-1;i--) {
    	rev=rev+a;
    	if(rev==a) {
    		System.out.println(a +" is a palindrome");
  
    	}
    	else {
    		System.out.println(a + " is not a palindrome");
    	}
    }
    
	}

}
