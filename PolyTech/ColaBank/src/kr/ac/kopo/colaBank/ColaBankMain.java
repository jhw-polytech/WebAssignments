package kr.ac.kopo.colaBank;

import kr.ac.kopo.colaBank.login.ui.LoginUI;

public class ColaBankMain {

    public static void main(String[] args) {

        LoginUI ui = new LoginUI();
//        AccountUI aui = new AccountUI();
        try {
            ui.execute();
//            aui.execute();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
