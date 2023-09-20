package org.qa.skytdd;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<BankAccount> Accounts = new ArrayList<BankAccount>();

    public Bank(){}

    public BankAccount findAccount(int AccountNumber){

        BankAccount found = null;
        for (BankAccount ba: Accounts) { // THIS - for loop
            if (ba.getAccountNumber() == AccountNumber){
                found = ba;
                break;
            }
        }

        return found;
    }

    public void AddAccount(BankAccount newBankAccount) throws Exception {
        for (int i = 0; i < Accounts.size(); i++){
            if (Accounts.get(i) == newBankAccount || Accounts.get(i).getAccountNumber() == newBankAccount.getAccountNumber()){
                throw new Exception("This account already exists with this bank");
            }
        }

        Accounts.add(newBankAccount);
    }

    public List<BankAccount> GetAllAccount(){
        return  Accounts;
    }

}
