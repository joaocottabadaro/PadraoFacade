import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FacadeTest {


    @Test
   public void deveRetornarSaque() {
        BankAccountFacade accessingBank = new BankAccountFacade(12345678, 1234);
        assertEquals("50.0 was withdrawn",  accessingBank.withdrawCash(50.00));
    }


    @Test
    public void deveRetornarDepositarInvalido() {
        BankAccountFacade accessingBank = new BankAccountFacade(12345678, 1234);
        assertEquals(" Cash withdraw failed",  accessingBank.withdrawCash(100000.00));
    }

    @Test
    public void deveRetornarSaqueInvalido() {
        BankAccountFacade accessingBank = new BankAccountFacade(12345678, 1234);


        assertEquals("Transaction Complete",  accessingBank.depositCash(10000.00));;
    }

    @Test
    public void deveRetornarDepositar() {
        BankAccountFacade accessingBank = new BankAccountFacade(12345678, 1234);


        assertEquals("Transaction Complete",  accessingBank.depositCash(50.00));;
    }


}
