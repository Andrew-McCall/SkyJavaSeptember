package org.qa.skytdd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Bank implements Iterable<BankAccount>{

    private List<BankAccount> Accounts = new ArrayList<BankAccount>();

    public Bank(){}

    public void Sort(){
        this.Accounts.sort(BankAccount::compareTo);
    }

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

    public BankAccount findAccountByIndex(int index){
        if (index < 0 || index > this.Accounts.size()) return null;

        return this.Accounts.get(index);
    }

    public void PrintAlls(){
        System.out.println(this.toString());
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (BankAccount ba: this.Accounts){
            sb.append(ba.toString() + "\n");
        }
        return sb.toString();
    }

    public BankAccount DeleteByIndex(int index){
        if (index < 0 || index > this.Accounts.size()) return null;

        return this.Accounts.remove(index);
    }

    public BankAccount DeleteByAccountNumber(int accountNumber){
        for (int i = 0; i < this.Accounts.size(); i++){
            if (accountNumber == this.Accounts.get(i).getAccountNumber()){
                return this.Accounts.remove(i);
            }
        }
        return null;
    }

    public BankAccount DeleteByAccountNumber2(int accountNumber){
        BankAccount found = this.findAccount(accountNumber);
        this.Accounts.remove(found);
        return found;
    }

    public BankAccount[] getArray(){
        return this.Accounts.toArray(BankAccount[]::new);
    }

    public double average(){
        double sum = 0;
        for (BankAccount ba : this.Accounts){
            sum += ba.getBalance();
        }
        return sum/this.Accounts.size();
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

    @Override
    public Iterator<BankAccount> iterator() {
        return this.Accounts.iterator();
    }

    @Override
    public void forEach(Consumer<? super BankAccount> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<BankAccount> spliterator() {
        return Iterable.super.spliterator();
    }
}
