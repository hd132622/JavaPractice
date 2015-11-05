package org.dimigo.thread;

public class Runner extends Thread{
	private String name;
	
	public int distance = 100;

	public Runner(){
		super();
	}
	
	public Runner(String name) {
		super();
		this.name = name;
	}
	
	public void run(){
		for(int i=10;i>=0;i--){
			System.out.println(name + " " + distance + " 미터");
			distance-=10;
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name + " 골인");
	}
}