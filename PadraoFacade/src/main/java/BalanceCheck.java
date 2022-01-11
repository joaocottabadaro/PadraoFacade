public class BalanceCheck {

    private double balance = 1000.00;

    public double getBalance() { return balance; }

    public void decreaseCashInAccount(double cashWithdrawn) { balance -= cashWithdrawn; }

    public void increaseCashInAccount(double cashDeposited) { balance += cashDeposited; }

    public boolean haveEnoughMoney(double cashToWithdrawal) {

        if(cashToWithdrawal > getBalance()) {

            System.out.println("Error: You don't have enough money");

            System.out.println("Current Balance: " + getBalance());

            return false;

        } else {

            decreaseCashInAccount(cashToWithdrawal);

            System.out.println("Withdrawal Complete: Current Balance is " + getBalance());

            return true;

        }

    }


    public void makeDeposit(double cashToDeposit) {

        increaseCashInAccount(cashToDeposit);

        System.out.println("Deposit Complete: Current Balance is " + getBalance());

    }

}
