package org.dimigo.thread;

public class Runner extends Thread{
	private String name;

	public Runner(){
		super();
	}
	
	public Runner(String name) {
		super();
		this.name = name;
	}
	
	public void run(){
		for(int i=10;i>=0;i--){
			System.out.println(name + " " + (i*10) + " 미터");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name + " 골인");
	}
}