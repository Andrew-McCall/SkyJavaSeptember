
import junit.framework.*;
import org.junit.Test;
import org.qa.skytdd.BankAccount;

public class BankAccountTest {

    @Test
    public void CreateWithAllDetails(){
        int accountNumber = 1;
        double balance = 1.562;
        String accountName = "Bank Account";

        BankAccount ba = new BankAccount(accountNumber, balance, accountName);

        Assert.assertEquals(balance, ba.getBalance());
        Assert.assertEquals(accountNumber, ba.getAccountNumber());
        Assert.assertEquals(accountName, ba.getAccountName());
    }

    @Test
    public void CreateWithAccountNumber(){
        int a = 10/0;
    }

    @Test
    public void CreateWithAccountNumberAndBalance(){
        int a = 10/0;
    }


    // EXTENSION
    @Test
    public void AddFunds(){
        int a = 10/0;
    }

    @Test
    public void RemoveFunds(){
        int a = 10/0;
    }

}
