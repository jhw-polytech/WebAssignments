package com.company.day17.homework;

public class HongFamily extends Thread {
	String who;
	HongAccount hongAcc;
		public HongFamily(String who, HongAccount hongAcc) {
		this.who = who;
		this.hongAcc = hongAcc;
	}
}
