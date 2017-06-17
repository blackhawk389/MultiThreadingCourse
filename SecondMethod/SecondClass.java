package SecondMethod;

import java.util.ArrayList;
import java.util.List;

import src.ClassOne;



public class SecondClass implements Runnable {
	
	List<String> list;

	public SecondClass() {
		//anonymous inner class
		//Always program on interface rather implementation
		List<String> list = new ArrayList<String>() {{
		    add("A");
		    add("B");
		    add("C");
		    add("D");
		    add("E");
		}};
	}

	public void run() {
		
		for(String x : list)
		System.out.println(list.get(Integer.parseInt(x)));
		
		Thread.sleep(1000);

	}
	
	public static void main(String[] args) {
		run();

	}


}



