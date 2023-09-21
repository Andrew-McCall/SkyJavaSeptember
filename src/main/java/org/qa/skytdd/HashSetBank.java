package org.qa.skytdd;

import java.util.HashSet;
import java.util.Set;

public class HashSetBank {

    private Set<BankAccount> Accounts = new HashSet<>();

    public HashSetBank(){}

    public boolean AddAccount(BankAccount newBankAccount){
        return this.Accounts.add(newBankAccount);
    }

    public boolean DeleteAccount(BankAccount newBankAccount){
        return this.Accounts.remove(newBankAccount);
    }

    public boolean DeleteAccount(int AccountNumber){
        BankAccount hashed = new BankAccount(AccountNumber);
        return this.Accounts.remove(hashed);
    }

    public BankAccount FindAccount(int AccountNumber){

        // TODO Streams
        for (BankAccount ba: this.Accounts){
            if (ba.getAccountNumber() == AccountNumber){
                return ba;
            }
        }

        return null;
    }



}
