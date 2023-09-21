import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.qa.skytdd.BankAccount;
import org.qa.skytdd.HashSetBank;

import java.util.HashSet;

public class HashSetBankTest {

    private HashSetBank testBank;
    private BankAccount[] testData = {new BankAccount(19), new BankAccount(20,3424.2 ), new BankAccount(36,352424.76, "Savigns" )};

//    @BeforeClass
    @Before // Before every test
    public void Setup(){
        testBank = new HashSetBank();
        this.testBank.AddAccount(testData[0]);
        this.testBank.AddAccount(testData[1]);
        this.testBank.AddAccount(testData[2]);
    }

    @Test
    public void DeleteAccount(){
        Assert.assertTrue(testBank.DeleteAccount(testData[1]));
        Assert.assertNull(testBank.FindAccount(testData[1].getAccountNumber()));
    }

    @Test
    public void DeleteAccountByAccountNumber(){
        Assert.assertTrue(testBank.DeleteAccount(testData[1].getAccountNumber()));
        Assert.assertNull(testBank.FindAccount(testData[1].getAccountNumber()));
    }

}
