package kr.ac.kopo.colaBank.accountManager.vo;

public class AccountVO {

    private String id;
    private String accountNumber;
    private String bank;
    private double balance;
    private String nickname;

    public AccountVO() {
    }

    public AccountVO(String id, String accountNumber, String bank, double balance, String nickname) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.bank = bank;
        this.balance = balance;
        this.nickname = nickname;
    }

    public String getId() { return id; }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
