package com.company.day17.homework;

public class HongBankMain {

	public static void main(String[] args) {

		HongBankUtil util = new HongBankUtil();

		HongAccount hongAcc = new HongAccount("홍길동", 10000);
		new HongFamily("홍길동", hongAcc);
		new HongFamily("어머니", hongAcc);
		new HongFamily("아버지", hongAcc);

		try {


		} catch(Exception e) {
			e.printStackTrace();
		}

	}
}
