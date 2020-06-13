package kr.ac.kopo.colaBank.accountManager.ui;

import kr.ac.kopo.colaBank.accountManager.service.AccountService;
import kr.ac.kopo.colaBank.accountManager.vo.AccountVO;
import kr.ac.kopo.colaBank.ui.BaseUI;




import java.util.*;

public class ByBankUI extends BaseUI {
    @Override
    public void execute() throws Exception {
        System.out.println("은행별 계좌를 조회하실 수 있습니다.");
        AccountService service = new AccountService();
        List<AccountVO> list = service.accountByBank();

        Scanner sc = new Scanner(System.in);


        ////////////////////////////// print


        System.out.println();

        ////////////////////////////////////

    }

}
