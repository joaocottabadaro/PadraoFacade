public class SecurityCodeCheck {

    private int securityCode = 1234;

    public int getSecurityCode() {
        return securityCode;
    }

    public boolean verifyCode(int secCode) {

        if (secCode == getSecurityCode()) {
            return true;
        } else {
            return false;
        }
    }
}