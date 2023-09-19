package org.qa.skytdd;

public class BankAccount {
    private int AccountNumber;
    private double Balance;
    private String AccountName;

    public BankAccount(int AccountNumber){
        this.AccountNumber = AccountNumber;
        this.AccountName = "Account "+ AccountNumber;
    }

    public BankAccount(int accountNumber, double balance) {
        AccountNumber = accountNumber;
        Balance = balance;
    }

    public BankAccount(int accountNumber, double balance, String accountName) {
        AccountNumber = accountNumber;
        Balance = balance;
        AccountName = accountName;
    }

    public double RemoveFunds(double amount){
        this.Balance -= amount;
        return this.Balance;
    }

    public double AddFunds(double amount){
        this.Balance += amount;
        return this.Balance;
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public double getBalance() {
        return Balance;
    }

    void setBalance(double balance) {
        Balance = balance;
    }

    public String getAccountName() {
        return AccountName;
    }

    void setAccountName(String accountName) {
        AccountName = accountName;
    }
}
