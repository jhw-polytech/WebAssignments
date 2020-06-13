package kr.ac.kopo.colaBank.login.ui;

import kr.ac.kopo.colaBank.ui.BaseUI;
import kr.ac.kopo.colaBank.ui.ExitUI;
import kr.ac.kopo.colaBank.ui.IUI;

public class LoginUI extends BaseUI {

    @Override
    public boolean execute() throws Exception {

        int type;
        IUI ui = null;

        while (true) {

            type = choiceMenu();
            switch (type) {
                case 1:
                    ui = new SignInUI();
                    break;

                case 0:
                    ui = new ExitUI();
                    break;
            }

            if (ui != null) {
                if (ui.execute())
                    break;
            }
        }

        return true;
    }

    private int choiceMenu() {
        System.out.println("---------------------------------");
        System.out.println("\t\t계좌 관리 프로그램(DB)");
        System.out.println("---------------------------------");
        System.out.println("\t1. 로그인");
        System.out.println("\t0. 종료");
        System.out.println("---------------------------------");
        int type = scanInt("번호를 선택하세요");
        return type;
    }
}
