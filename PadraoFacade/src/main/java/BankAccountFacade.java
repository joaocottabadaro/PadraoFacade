public class BankAccountFacade {

    private int accountNumber;

    private int securityCode;

            AccountNumberCheck accountCheck;
            SecurityCodeCheck codeChecker;
            BalanceCheck balanceChecker;

    public BankAccountFacade(int accountNumber, int securityCode) {
        this.accountNumber = accountNumber;
        this.securityCode = securityCode;

        accountCheck =  new AccountNumberCheck();
        codeChecker =  new SecurityCodeCheck();
        balanceChecker =  new BalanceCheck();
    }


    public int getAccountNumber(){ return accountNumber;}
    public int getSecurityCode(){return securityCode;}

    public String withdrawCash (double cash){

            if(accountCheck.accountActive(getAccountNumber()) && codeChecker.verifyCode(getSecurityCode()) &&
                    balanceChecker.haveEnoughMoney(cash)) {


                return   cash +  " was withdrawn";
            } else {

                return " Cash withdraw failed";
            }


    }

        public String depositCash(double cashToDeposit){

            if(accountCheck.accountActive(getAccountNumber()) &&

            codeChecker.verifyCode(getSecurityCode())) {

                balanceChecker.makeDeposit(cashToDeposit);

               return "Transaction Complete";

            } else {

                return "Transaction failed";

            }

        }

    }


