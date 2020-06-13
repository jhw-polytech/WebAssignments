package kr.ac.kopo.colaBank.accountManager.ui;

import kr.ac.kopo.colaBank.accountManager.service.AccountService;
import kr.ac.kopo.colaBank.accountManager.vo.AccountVO;
import kr.ac.kopo.colaBank.ui.BaseUI;

import java.util.List;

public class SearchAllUI extends BaseUI {

    @Override
    public void execute() throws Exception {
        System.out.println("전체 계좌 조회 서비스입니다.");

        AccountService service = new AccountService();
        List<AccountVO> list = service.searchAll();

        ////////////////////////////
        // print

        System.out.println();

        ///////////////////////////
    }
}
