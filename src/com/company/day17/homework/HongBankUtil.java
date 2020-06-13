package com.company.day17.homework;

import java.util.Random;

public class HongBankUtil {

	private Random random;

	public HongBankUtil() {
		random = new Random();
	}

	public int amountDecision() {

		// 1~9까지 난수를 추출하여 1000원을 곱해 리턴
		int amount = random.nextInt(9) + 1;
		amount = amount * 1000;
		return amount;

	}

	public synchronized void deposit(HongAccount hongAccount) {
		
		try {
			int amount = amountDecision();
			int bal = hongAccount.getBalance();
			bal += amount;
			hongAccount.setBalance(bal);
			System.out.println(amount+"원을 입금합니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public synchronized void withdraw(HongAccount hongAccount) {
		
		try {
			int amount = amountDecision();
			int bal = hongAccount.getBalance();
			bal -= amount;
			hongAccount.setBalance(bal);
			System.out.println(amount+"원을 출금합니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
