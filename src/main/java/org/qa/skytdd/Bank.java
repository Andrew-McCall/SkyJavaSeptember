package org.qa.skytdd;

public class Bank {

    private BankAccount[] Accounts = new BankAccount[0];

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
        BankAccount[] newList = new BankAccount[Accounts.length + 1];

        for (int i = 0; i < Accounts.length; i++){
            if (Accounts[i].getAccountNumber() == newBankAccount.getAccountNumber()){ // no dupes
                return;
            }
            newList[i] = Accounts[i];
        }

        newList[Accounts.length-1] = newBankAccount;

        Accounts = newList;
    }

}
