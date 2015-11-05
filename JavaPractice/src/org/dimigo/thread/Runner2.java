package org.dimigo.thread;

public class Runner2 extends Thread implements Runnable{
	private String name;
	
	public Runner2(){
		super();
	}
	
	public Runner2(String name) {
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