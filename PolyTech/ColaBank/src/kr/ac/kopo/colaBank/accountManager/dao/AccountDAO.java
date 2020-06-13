package kr.ac.kopo.colaBank.accountManager.dao;

import kr.ac.kopo.colaBank.DAO.BaseDAO;
import kr.ac.kopo.colaBank.accountManager.vo.AccountVO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AccountDAO extends BaseDAO {

    // 1. 신규계좌 생성
    public boolean createAccount() {
        boolean result = false;
        return result;
    }

    // 2-1. 통합계좌관리 - 등록
    public boolean registerAccount() {
        boolean result = false;
        AccountVO accountVO = new AccountVO();
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("insert into account(id, account_number, bank, balance, nickname) ");
            sql.append("values(?, ?, ?, ?, ?) ");

            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setString(1, accountVO.getId());
            pstmt.setString(2, accountVO.getAccountNumber());
            pstmt.setString(3, accountVO.getBank());
            pstmt.setDouble(4, accountVO.getBalance());
            pstmt.setString(5, accountVO.getNickname());

            int row = pstmt.executeUpdate();

            if (row != 0) {
                result = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    // 2-2. 통합계좌관리 - 별명 수정
    public boolean alterAccount(String newName) {
        boolean result = false;
        AccountVO accountVO = new AccountVO();
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("update account set where account_number = ? ");

            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setString(1, newName);

            int row = pstmt.executeUpdate();

            if (row != 0) {
                result = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    // 2-3. 통합계좌관리 - 삭제
    public boolean deleteAccount() {
        boolean result = false;
        AccountVO accountVO = new AccountVO();
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("delete from account where account_number = ? ");

            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setString(1, accountVO.getAccountNumber());

            int row = pstmt.executeUpdate();

            if (row != 0) {
                result = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }


    // 2-4. 통합계좌관리 - 별명수정
    public boolean changeNickname() {
        boolean result = false;
        AccountVO accountVO = new AccountVO();

        try {
            StringBuilder sql = new StringBuilder();
            sql.append("update account set nickname = ? where id = ? ");

            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setString(1, accountVO.getNickname());
            pstmt.setString(2, BaseDAO.userId);

            int rs = pstmt.executeUpdate();

            if (rs != 0) {
                result = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    // 3. 계좌번호로 계좌조회
    public AccountVO searchOne(String account) {

        AccountVO accountVO = null;

        try {
            StringBuilder sql = new StringBuilder();

            sql.append("select * from account where id = ? and account_number = ? ");

            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setString(1, BaseDAO.userId);
            pstmt.setString(2, account);

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                accountVO = new AccountVO(BaseDAO.userId, account, rs.getString("bank"),
                        rs.getDouble("balance"), rs.getString("nickname"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return accountVO;
    }

    // 4. 전체계좌 조회
    public List<AccountVO> searchAll() {
        List<AccountVO> list = new ArrayList<>();

        try {
            StringBuilder sql = new StringBuilder();

            sql.append("select id from account where id = ? ");

            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setString(1, BaseDAO.userId);

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                list.add(new AccountVO(rs.getString("ID"), rs.getString("account_number"), rs.getString("bank"),
                        rs.getDouble("balance"), rs.getString("grade")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    // 5. 은행별 계좌정보 리스트
    public List<AccountVO> listPerBank() {
        List<AccountVO> list = new ArrayList<>();
        AccountVO accountVO = new AccountVO();

        try {
            StringBuilder sql = new StringBuilder();

            sql.append("select * from account where bank = ? ");

            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setString(1, accountVO.getBank());

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                list.add(new AccountVO(rs.getString("ID"), rs.getString("account_number"), rs.getString("bank"),
                        rs.getDouble("balance"), rs.getString("grade")));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    // 6-1. 입금
    public boolean deposit() {
        boolean result = false;
        AccountVO accountVO = new AccountVO();

        try {
            StringBuilder sql = new StringBuilder();
            sql.append("update account set balance = balance + ? where id = ? ");

            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setDouble(1, accountVO.getBalance());
            pstmt.setString(2, BaseDAO.userId);

            int row = pstmt.executeUpdate();

            if (row != 0) {
                result = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    // 6-2. 출금
    public boolean withdraw() {
        boolean result = false;
        AccountVO accountVO = new AccountVO();

        try {
            StringBuilder sql = new StringBuilder();
            sql.append("update account set balance = balance - ? where id = ? ");

            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setDouble(1, accountVO.getBalance());
            pstmt.setString(2, BaseDAO.userId);

            int row = pstmt.executeUpdate();

            if (row != 0) {
                result = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    // 6-3. 이체
    public boolean transfer() {
        boolean result = false;

        return result;
    }
}
