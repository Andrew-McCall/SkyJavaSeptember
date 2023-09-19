package org.qa.skytdd;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<BankAccount> Accounts = new ArrayList<BankAccount>();

    public Bank(){}

    public BankAccount findAccount(int AccountNumber){

        BankAccount found = null;
        for (BankAccount ba: Accounts) {
            if (ba.getAccountNumber() == AccountNumber){
                found = ba;
                break;
            }
        }

        return found;
    }

    public void AddAccount(BankAccount newBankAccount){
        Accounts.add(newBankAccount);
    }

}
