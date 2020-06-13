package kr.ac.kopo.colaBank.accountManager.ui;
/*
    입금/출금/이체 서비스
*/

import kr.ac.kopo.colaBank.accountManager.service.AccountService;
import kr.ac.kopo.colaBank.accountManager.vo.AccountVO;
import kr.ac.kopo.colaBank.ui.BaseUI;

import java.util.Scanner;

public class MoveMoneyUI extends BaseUI {

    @Override
    public void execute() throws Exception {
        System.out.println("입금/출금/이체 서비스입니다.");

        AccountService service = new AccountService();
        boolean result = false;
        String action = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("원하시는 서비스를 선택해주세요.");
        System.out.println("1. 입금");
        System.out.println("2. 출금");
        System.out.println("3. 이체");

        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                result = service.deposit();
                action = "입금";
                break;
            case 2:
                result = service.withdraw();
                action = "출금";
                break;
            case 3:
                result = service.transfer();
                action = "이체";
                break;
        }

        if (result) {
            System.out.println("요청하신 " + action + "서비스가 완료되었습니다.");
        } else {
            System.out.println("요청하신" + action + "서비스가 실패하였습니다.");
            System.out.println("입력하신 정보를 다시 한 번 확인해주세요.");
        }

        System.out.println();
    }
}
