package kr.ac.kopo.colaBank.accountManager.service;

public class AccountServiceFactory {

    private static AccountService service = null;

    public static AccountService getBoardService() {

        if(service == null) {
            service = new AccountService();
        }

        return service;
    }
}
