package com.test.lamda.utilities;

public class CommonMethods {
	static int min = 100;  
	static int max = 400;
	static int b = (int)(Math.random()*(max-min+1)+min); 
	
	public static String emailID="shihab"+ b +"@gmail.com";
	public static String passwordVal="shihab@gmail";
	
	public static void timeout() throws InterruptedException {
		Thread.sleep(3000);
	}
	
	public static void timeout(int time) throws InterruptedException {
		Thread.sleep(time);
	}
}
