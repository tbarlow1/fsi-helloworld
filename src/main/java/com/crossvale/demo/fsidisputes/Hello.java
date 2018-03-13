package com.crossvale.demo.fsidisputes;

public class Hello {
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("Hello world!");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("We received an interrupted exception...carry on");
			}
		}
	}

}
