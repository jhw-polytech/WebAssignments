package kr.ac.kopo.colaBank.login.ui;

import kr.ac.kopo.colaBank.login.vo.LoginVO;
import kr.ac.kopo.colaBank.ui.BaseUI;

public class SignInUI extends BaseUI {

    @Override
    public boolean execute() throws Exception {

        boolean bLogin = false;

        String id = scanStr("아이디를 입력하세요 : ");
        String password = scanStr("비밀번호를 입력하세요 : ");

        // 메모리 or file or DB에 게시물을 저장하는 서비스 /////
        LoginVO member = new LoginVO(id, password);

        member = loginService.signIn(member);

        if(member != null){
            System.out.println("로그인을 하였습니다.");
            bLogin = true;
        }
        else {
            System.out.println("로그인을 실패하였습니다. 아이디와 비밀번호를 확인해주세요.");
//            System.out.println("입력하신 아이디: " + member.getId() + );
        }
        //////////////////////////////////////////////

        return bLogin;
    }
}


