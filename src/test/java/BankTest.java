import junit.framework.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.qa.skytdd.Bank;
import org.qa.skytdd.BankAccount;

public class BankTest {

    private Bank testBank;

    @Before
    public void Setup(){
        testBank = new Bank();
        testBank.AddAccount(new BankAccount(1));
        testBank.AddAccount(new BankAccount(2, 10));
        testBank.AddAccount(new BankAccount(2, 100, "andrew"));
    }

    @Test
    public void FindOne(){
        BankAccount ba = testBank.findAccount(1);
        Assert.assertEquals(1, ba.getAccountNumber());
        Assert.assertEquals(0, ba.getBalance(), 0.0001);
        Assert.assertEquals("Account 1", ba.getAccountName());
    }

    @Test
    public void FindTwo(){
        BankAccount ba = testBank.findAccount(2);
        Assert.assertEquals(2, ba.getAccountNumber());
        Assert.assertEquals(10, ba.getBalance(), 0.0001);
        Assert.assertEquals("Account 2", ba.getAccountName());
    }


    @After
    public void Cleanup(){

    }

}
