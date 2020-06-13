package Assignments.threads;

public class HongFamily extends Thread {
	String who;
	HongAccount hongAcc;
		public HongFamily(String who, HongAccount hongAcc) {
		this.who = who;
		this.hongAcc = hongAcc;
	}
}
