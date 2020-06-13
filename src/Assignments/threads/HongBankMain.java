package Assignments.threads;

public class HongBankMain {

	public static void main(String[] args) {

		HongAccount hongAcc = new HongAccount("홍길동", 10000);

		HongFamily gildong = new HongFamily("홍길동", hongAcc);
		HongFamily mother = new HongFamily("어머니", hongAcc);
		HongFamily father = new HongFamily("아버지", hongAcc);

		try {
			gildong.start();
			mother.start();
			father.start();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
