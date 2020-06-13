package kr.ac.kopo.colaBank.login.vo;

public class LoginVO {
    private String id;
    private String password;
    private String mName;
    private int phoneNo;
    private int memberNo;

    public LoginVO() {
    }

    public LoginVO(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public LoginVO(String id, String password, String mName, int phoneNo, int memberNo) {
        this.id = id;
        this.password = password;
        this.mName = mName;
        this.phoneNo = phoneNo;
        this.memberNo = memberNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(int memberNo) {
        this.memberNo = memberNo;
    }

    @Override
    public String toString() {
        return "LoginVO{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", mName='" + mName + '\'' +
                ", phoneNo=" + phoneNo +
                ", memberNo=" + memberNo +
                '}';
    }
}
