package kr.ac.kopo.colaBank.accountManager.ui;

import kr.ac.kopo.colaBank.accountManager.service.AccountService;
import kr.ac.kopo.colaBank.ui.BaseUI;

import java.util.Scanner;

public class ManageUI extends BaseUI {

    @Override
    public void execute() throws Exception {
        System.out.println("계좌정보를 관리할 수 있는 서비스입니다.");
        System.out.println("원하는 서비스를 선택하세요.");
        System.out.println("1. 계좌 등록");
        System.out.println("2. 계좌 별명 수정");
        System.out.println("3. 계좌 삭제");

        int choice = scanInt("");

        AccountService service = new AccountService();
        boolean result = false;
        String action = "";

        switch(choice) {
            case 1:
                result = service.registerAccount();
                action = "계좌 등록이 ";
                break;
            case 2:
                String newName = scanStr("바꿀 별명을 입력하세요.");
                result = service.alterAccount(newName);
                action = "계좌 수정이 ";
                break;
            case 3:
                result = service.deleteAccount();
                action = "계좌 삭제가 ";
                break;
        }
        if (result) {
            System.out.println(action + "성공하였습니다");
        } else {
            System.out.println(action + "실패하였습니다");
        }
    }


}
