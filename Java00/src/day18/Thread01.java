package day18;

public class Thread01 extends Thread {
	public void run() {
		for(int i = 0 ; i < 200 ; i++ ) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {}
			System.out.print(i+1 + " | ");
		}
	}
}
