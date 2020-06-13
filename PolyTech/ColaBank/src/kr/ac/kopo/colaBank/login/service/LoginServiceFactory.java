package kr.ac.kopo.colaBank.login.service;

public class LoginServiceFactory {

    private static LoginService service = null;

    public static LoginService getLoginService() {

        if(service == null) {
            service = new LoginService();
        }
        return service;
    }
}
