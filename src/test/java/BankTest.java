import junit.framework.*;
import org.junit.*;
import org.junit.Assert;
import org.junit.Test;
import org.qa.skytdd.Bank;
import org.qa.skytdd.BankAccount;

import java.util.List;

public class BankTest {

    private Bank testBank;

    // @ Before runs before EVERY TEST
    @Before
    public void Setup() throws Exception {
        testBank = new Bank();
        testBank.AddAccount(new BankAccount(1));
        testBank.AddAccount(new BankAccount(2, 10));
        testBank.AddAccount(new BankAccount(3, 100, "andrew"));
    }

    //@BeforeClass // Runs once before All. @BeforeAll (Junit 5 name)


    @Test
    public void AddAccount(){
        try{
            testBank.AddAccount(new BankAccount(5, 1523, "gjhgelg"));
            if (testBank.DeleteByAccountNumber(5) == null){
                Assert.fail();
            }
        }catch (Exception e){
            Assert.fail();
        }
    }

    @Test
    public void TestToArray(){
        Assert.assertEquals(3, testBank.getArray().length);
    }

    @Test
    public void Average(){
        double expected = 110.0/3.0;
        Assert.assertEquals(expected, testBank.average(), 0.0001);
    }

    @Test
    public void DeleteByNumber() throws Exception {
        BankAccount deleted = testBank.DeleteByAccountNumber(2);
        Assert.assertEquals(deleted, new BankAccount(2, 10));
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
