package com.company.day17.homework;

public class CallCenter extends Thread {

	private int centerNo;
	private int callCount;
	private static int donation;
	private CallFromCitizen cfc;
	
	// 생성자
	public CallCenter(int centerNo) {
		this.centerNo = centerNo;
		cfc = new CallFromCitizen();
	}
	
	
	@Override
	public void run() {
		
		try {
			cfc.callForDonation();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}