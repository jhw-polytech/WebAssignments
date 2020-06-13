package kr.ac.kopo.colaBank.accountManager.service;

import kr.ac.kopo.colaBank.accountManager.dao.AccountDAO;
import kr.ac.kopo.colaBank.accountManager.vo.AccountVO;

import java.util.List;

public class AccountService {

    private AccountDAO accountDAO;

    public AccountService() {
        accountDAO = new AccountDAO();
    }

    // 1. 신규계좌 생성
    public boolean createAccount() {
        boolean result = accountDAO.createAccount();
        return result;
    }

    // 2-1. 통합계좌관리 - 등록
    public boolean registerAccount() {
        boolean result = false;
        result = accountDAO.registerAccount();
        return result;
    }

    // 2-2. 통합계좌관리 - 수정
    public boolean alterAccount(String newName) {
        boolean result = accountDAO.alterAccount(newName);
        return result;
    }

    // 2-3. 통합계좌관리 - 삭제
    public boolean deleteAccount() {
        boolean result = accountDAO.deleteAccount();
        return result;
    }

    // 2-4. 통합계좌관리 - 별칭변경
    public boolean changeNickName() {
        boolean result = false;
        result = accountDAO.changeNickname();
        return result;
    }

    // 3. 계좌검색
    public AccountVO searchOne(String account) {
        AccountVO accountVO = accountDAO.searchOne(account);
        return accountVO;
    }

    // 4. 전체계좌 조회
    public List<AccountVO> searchAll() {
        List<AccountVO> list = accountDAO.searchAll();
        return list;
    }

    // 5. 은행별 계좌정보 리스트
    public List<AccountVO> accountByBank() {
        List<AccountVO> list = accountDAO.listPerBank();
        return list;
    }

    // 6-1. 입금
    public boolean deposit() {
        boolean result = accountDAO.deposit();
        return result;
    }

    // 6-2. 출금
    public boolean withdraw() {
        boolean result = accountDAO.withdraw();
        return result;
    }

    // 6-3. 이체
    public boolean transfer() {
        boolean result = accountDAO.transfer();
        return result;
    }

}
