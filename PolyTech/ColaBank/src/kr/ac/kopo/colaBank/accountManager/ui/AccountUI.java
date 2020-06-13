package kr.ac.kopo.colaBank.accountManager.ui;

import kr.ac.kopo.colaBank.login.ui.SignInUI;
import kr.ac.kopo.colaBank.ui.BaseUI;
import kr.ac.kopo.colaBank.ui.ExitUI;
import kr.ac.kopo.colaBank.ui.IUI;

public class AccountUI extends BaseUI {
    @Override
    public void execute() throws Exception {

        int type;
        IUI ui = null;

        while (true) {
            type = choiceMenu();
            switch (type) {
                case 1:
                    ui = new CreateUI();
                    break;
                case 2:
                    ui = new ManageUI();
                    break;
                case 3:
                    ui = new SearchOneUI();
                    break;
                case 4:
                    ui = new SearchAllUI();
                    break;
                case 5:
                    ui = new ByBankUI();
                    break;
                case 6:
                    ui = new MoveMoneyUI();
                    break;
                case 0:
                    ui = new ExitUI();
                    break;
            }

            if (ui != null) {
                ui.execute();
            }
        }

    }

    private int choiceMenu() {
        System.out.println("----------------------------------------");
        System.out.println("\t\t계좌 관리 프로그램(DB)");
        System.out.println("----------------------------------------");
        System.out.println("\t1. 신규계좌생성");
        System.out.println("\t2. 통합계좌관리 - 계좌 등록/수정/삭제");
        System.out.println("\t3. 계좌 검색"); // 계좌번호로 계좌검색
        System.out.println("\t4. 전체계좌 조회");
        System.out.println("\t5. 은행별 계좌정보 리스트");
        System.out.println("\t6. 입출금/이체");
        System.out.println("\t0. 종료");
        System.out.println("----------------------------------------");
        int type = scanInt("원하시는 서비스 번호를 선택해주세요");
        return type;
    }

}
