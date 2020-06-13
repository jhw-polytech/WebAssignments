package kr.ac.kopo.colaBank.accountManager.ui;

import kr.ac.kopo.colaBank.accountManager.service.AccountService;
import kr.ac.kopo.colaBank.accountManager.vo.AccountVO;
import kr.ac.kopo.colaBank.ui.BaseUI;

import java.util.List;
import java.util.Scanner;

public class SearchOneUI extends BaseUI {

    @Override
    public void execute() throws Exception {
        System.out.println("계좌번호로 계좌 서비스입니다.");

        String account = scanStr("조회하고자 하는 계좌번호를 입력하세요 : ");

        AccountService service = new AccountService();
        AccountVO accountVO = service.searchOne(account);

        if (accountVO != null) {
            System.out.println("계좌번호: " + accountVO.getAccountNumber());
            ////////////////////////////
            // print

            System.out.println();

            ///////////////////////////
        } else {
            System.out.println("등록된 계좌가 없습니다.");
        }
    }
}
