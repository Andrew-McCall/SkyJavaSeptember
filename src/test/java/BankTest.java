import junit.framework.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.qa.skytdd.Bank;
import org.qa.skytdd.BankAccount;

import java.util.List;

public class BankTest {

    //  Update Bank Class
    /// Create BankTest
    //  Setup the bank in an @Before
    //  findAccount
    //  AddAccount

    // Ext - Implement and Test
    // add exception when duplicate account is added
    // return an array of all accounts

    private Bank testBank;

    @Before
    public void Setup() throws Exception {
        testBank = new Bank();
        testBank.AddAccount(new BankAccount(1));
        testBank.AddAccount(new BankAccount(2, 10));
        testBank.AddAccount(new BankAccount(3, 100, "andrew"));
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

    @Test
    public void ExceptionOnDuplicate(){
        BankAccount ba = testBank.findAccount(1);

        try{
            testBank.AddAccount(ba);
            Assert.fail("Exception wasn't called");
        }catch (Exception e){
            Assert.assertEquals("This account already exists with this bank", e.getMessage());
        }
    }

    @Test
    public void ExceptionOnDuplicateAccountNumber(){
        BankAccount ba = new BankAccount(1);

        try{
            testBank.AddAccount(ba);
            Assert.fail("Exception wasn't called");
        }catch (Exception e){
            Assert.assertEquals("This account already exists with this bank", e.getMessage());
        }
    }

    @Test
    public void GetAllAccounts(){
        List<BankAccount> accounts = testBank.GetAllAccount();

        Assert.assertTrue( accounts.get(0).equals(new BankAccount(1)) );
        Assert.assertEquals(new BankAccount(2,10), accounts.get(1));
    }

    @After
    public void Cleanup(){

    }

}
