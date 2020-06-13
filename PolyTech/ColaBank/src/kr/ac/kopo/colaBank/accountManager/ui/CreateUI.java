package kr.ac.kopo.colaBank.accountManager.ui;
/*
    1. 신규 계좌 생성
*/

import kr.ac.kopo.colaBank.accountManager.service.AccountService;
import kr.ac.kopo.colaBank.accountManager.vo.AccountVO;
import kr.ac.kopo.colaBank.ui.BaseUI;

import java.util.List;

public class CreateUI extends BaseUI {
    @Override
    public void execute() throws Exception {
        System.out.println("신규 계좌 서비스입니다.");

        AccountService service = new AccountService();
        boolean result = service.createAccount();

        if(result) {
            System.out.println("계좌 생성이 완료되었습니다.");
            AccountUI accountUI = new AccountUI();
        } else {
            System.out.println("계좌 생성에 실패하였습니다.");
        }

    }
}
