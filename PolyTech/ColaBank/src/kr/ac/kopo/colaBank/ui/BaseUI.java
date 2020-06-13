package kr.ac.kopo.colaBank.ui;

import kr.ac.kopo.colaBank.accountManager.service.AccountService;
import kr.ac.kopo.colaBank.login.service.LoginService;
import kr.ac.kopo.colaBank.login.service.LoginServiceFactory;

import java.util.Scanner;

public abstract class BaseUI implements IUI {

    private Scanner sc;
    protected LoginService loginService;
    protected AccountService accountService;
    
    public BaseUI() {
        sc = new Scanner(System.in);
        loginService = LoginServiceFactory.getLoginService();
    }

    protected int scanInt(String msg) {
        System.out.println(msg);
        return Integer.parseInt(sc.nextLine());
    }

    protected String scanStr(String msg) {
        System.out.println(msg);
        return sc.nextLine();
    }

}
