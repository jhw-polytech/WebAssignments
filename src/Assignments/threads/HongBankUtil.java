package Assignments.threads;

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

	public synchronized void deposit(String who, HongAccount hongAccount) {

		try {
			notify();
			int amount = amountDecision();
			int bal = hongAccount.getBalance();
			bal += amount;

			hongAccount.setBalance(bal);
			System.out.println(who + " : " + amount + "원을 입금합니다.");
			System.out.println("현재 잔액은 " + bal + "원입니다.");

			wait();
			notifyAll();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public synchronized void withdraw(String who, HongAccount hongAccount) {

		try {
			notify();
			int amount = amountDecision();
			int bal = hongAccount.getBalance();
			bal -= amount;

			hongAccount.setBalance(bal);
			System.out.println(who + " : " + amount + "원을 출금합니다.");
			System.out.println("현재 잔액은 " + bal + "원입니다.");

			if (bal < 0) {
				System.out.printf("출금금액 %d원 => 잔액이 부족하여 출금을 할 수 없습니다.\n", amount);
				bal += amount;
			}

			wait();
			notifyAll();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
