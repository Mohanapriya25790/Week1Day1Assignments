package week1.day1;

public class Mobile {
public void makeCall() {
	System.out.println("make a call");
}
public void sendMsg() {
	System.out.println("send a msg");
}
public static void main(String[] args) {
	System.out.println("done");
	Mobile myMob = new Mobile();
	myMob.makeCall();
	myMob.sendMsg();
	
}
}
