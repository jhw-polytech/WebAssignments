package Assignments.threads;

import java.util.Random;

public class CallFromCitizen {
	
	Random random; 
	private int amount;
	
	
	public CallFromCitizen() {
		this.random = new Random();
	}
	
	
	// 
	
	// 입금할 액수를 반환하는 메소드
	public int amount() {
		amount = (random.nextInt()+1) * 1000;
		return amount;
	}
	
	//
	public void callForDonation() {
		
		int money = amount();
		System.out.println("");
	
		
	}
	
}
