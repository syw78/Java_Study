package chapter16.ex8;

public class Job extends Thread {
	public Thread name;
	
	public Job(String run) {
		 this.name=new Thread(run);
	}

	public void run() {
		byte n =0;
		while(true) {
			System.out.println(name+" "+n++);
			if(n==10) break;
		}
	}
}


