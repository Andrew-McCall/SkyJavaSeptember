
import junit.framework.*;
import org.junit.Test;
import org.qa.skytdd.BankAccount;

public class BankAccountTest {

    private final int accountNumber = 174;
    private final double balance = 1132.562;
    private final String accountName = "Bank Account Four";
    private final double funds = 43.253;

    @Test
    public void CreateWithAllDetails(){
        BankAccount ba = new BankAccount(accountNumber, balance, accountName);

        Assert.assertEquals(balance, ba.getBalance(), 0.0001);
        Assert.assertEquals(accountNumber, ba.getAccountNumber());
        Assert.assertEquals(accountName, ba.getAccountName());
    }

    @Test
    public void CreateWithAccountNumber(){
        BankAccount ba = new BankAccount(accountNumber);

        Assert.assertEquals(0, ba.getBalance(), 0.0001);
        Assert.assertEquals(accountNumber, ba.getAccountNumber());
        Assert.assertEquals("Account "+accountNumber, ba.getAccountName());
    }

    @Test
    public void CreateWithAccountNumberAndBalance(){
        BankAccount ba = new BankAccount(accountNumber, balance);

        Assert.assertEquals(balance, ba.getBalance(), 0.0001);
        Assert.assertEquals(accountNumber, ba.getAccountNumber());
        Assert.assertEquals("Account "+accountNumber, ba.getAccountName());
    }


    // EXTENSION
    @Test
    public void AddFunds(){
        BankAccount ba = new BankAccount(accountNumber, balance);

        double result = ba.AddFunds(funds);

        Assert.assertEquals(balance+funds, result, 0.0001);
    }

    @Test
    public void RemoveFunds() throws Exception {
        BankAccount ba = new BankAccount(accountNumber, balance);

        double result = ba.RemoveFunds(funds);

        Assert.assertEquals(balance-funds, result, 0.0001);
    }

    @Test
    public void CreateAccountNoArgs(){
        BankAccount.AccountCounter = 97;

        BankAccount ba = new BankAccount();


        Assert.assertEquals(0, ba.getBalance(), 0.0001);
        Assert.assertEquals(97, ba.getAccountNumber());
        Assert.assertEquals("Account 97", ba.getAccountName());
    }

    @Test
    public void RemoveFundsFails(){
        BankAccount ba = new BankAccount(0, 0);

        try{
            ba.RemoveFunds(10);
            Assert.fail(); // This will cause failure if reached
        }catch (Exception e){
            Assert.assertEquals("You can't have minus funds!", e.getMessage());
        }
    }

}
