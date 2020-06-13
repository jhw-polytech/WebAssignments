package Assignments.threads;

public class HongFamily extends Thread {
	String who;
	HongAccount hongAcc;
	private static HongBankUtil util = new HongBankUtil();

	public HongFamily(String who, HongAccount hongAcc) {
		this.who = who;
		this.hongAcc = hongAcc;
	}
	
	@Override
	public void run() {
		try {
			for(int i = 0; i<2; i++) {				
				util.deposit(who, hongAcc);
				util.withdraw(who, hongAcc);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
