package src;

public class ClassOne extends Thread{
	
	int[] output;
	
	public ClassOne() {
		output = new int[]{1, 2,3 ,4 ,5, 6, 7, 8};		
	}
	
	public void run() {
		super.run();
		
		for(int i : output){
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
