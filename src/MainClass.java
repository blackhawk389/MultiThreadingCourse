package src;

import SecondMethod.SecondClass;

public class MainClass {

	
	public static void main(String[] args) {
		ClassOne t1 = new ClassOne();
		ClassOne t2 = new ClassOne();
		
		Thread t3 = new Thread(new SecondClass());
		t3.start();
	
		t1.start();
		t2.start();
		

	}

}
