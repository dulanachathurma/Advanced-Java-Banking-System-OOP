package accounts;

import model.Person;

public abstract class DepositAccount implements Account {

    protected final String id;
    protected final Person owner;
    protected Double balance;

    public DepositAccount(String id, Person owner, double balance){
        this.id = id;
        this.owner = owner;
        this.balance = balance;
    }

    @Override
    public void credit(double amount) {
        balance += amount;
    }

    @Override
    public void debit(double amount) {
        balance -= amount;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        credit(amount);
    }

    @Override
    public String getAccountInfo() {
        return "ID: " + id + ", Owner: " + owner.display() + ", Balance: " + balance;
    }

    public abstract void withdraw(double amount);
}
