package kr.ac.kopo.colaBank.login.service;

import kr.ac.kopo.colaBank.login.dao.LoginDAO;
import kr.ac.kopo.colaBank.login.vo.LoginVO;

public class LoginService {

    private LoginDAO loginDAO;

    public LoginService() {
        loginDAO = new LoginDAO();
    }

    public LoginVO signIn(LoginVO member) {
        LoginVO loginVO = null;
        loginVO = loginDAO.signIn(member);
        return loginVO;
    }
}
