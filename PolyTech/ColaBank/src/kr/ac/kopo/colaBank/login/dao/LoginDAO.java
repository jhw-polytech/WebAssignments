package kr.ac.kopo.colaBank.login.dao;

import kr.ac.kopo.colaBank.DAO.BaseDAO;
import kr.ac.kopo.colaBank.login.vo.LoginVO;
import kr.ac.kopo.util.JDBCClose;

import java.sql.ResultSet;

public class LoginDAO extends BaseDAO {

    public LoginVO signIn(LoginVO member) {

        LoginVO mem = null;

        try {

            StringBuilder sql = new StringBuilder();
            sql.append("select id, password from member where id = ? and password = ?");

            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setString(1, member.getId());
            pstmt.setString(2, member.getPassword());

            ResultSet rs = pstmt.executeQuery();

            if(rs.next()) {
                mem = new LoginVO(rs.getString("id"), rs.getString("password"));
                BaseDAO.userId = rs.getString("id");
            }

        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            JDBCClose.close(conn, pstmt);
        }

        return mem;
    }


}
