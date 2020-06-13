package kr.ac.kopo.colaBank.login.service;

public class LoginSequence {
    private static int memberNo = 1;
    public static int getMemberSequence() {
        return memberNo++;
    }

}
