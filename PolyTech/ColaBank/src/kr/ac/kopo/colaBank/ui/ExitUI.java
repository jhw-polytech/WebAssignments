package kr.ac.kopo.colaBank.ui;


import kr.ac.kopo.colaBank.DAO.BaseDAO;
import kr.ac.kopo.util.JDBCClose;

public class ExitUI extends BaseUI {

    @Override
    public boolean execute() throws Exception {

        System.out.println("=========================");
        System.out.println("\n\t게시판 프로그램을 종료합니다.");
        System.out.println("\t BYE BYE~~~~");
        System.out.println("=========================");
        JDBCClose.close(BaseDAO.conn, BaseDAO.pstmt);
        System.exit(0);

        return true;
    }

}
