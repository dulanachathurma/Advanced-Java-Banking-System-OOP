package accounts;

import model.Person;

public abstract class LoanAccount implements Account {

    protected final String id;
    protected final Person owner;
    protected Double outstandingBalance;

    public LoanAccount(String id, Person owner, double initialBalance){
        this.id = id;
        this.owner = owner;
        this.outstandingBalance = initialBalance;
    }

    @Override
    public void credit(double amount) {
        outstandingBalance -= amount;
    }

    @Override
    public void debit(double amount) {
        outstandingBalance += amount;
    }

    @Override
    public double getBalance() {
        return outstandingBalance;
    }

    @Override
    public String getAccountInfo() {
        return "ID: " + id + ", Owner: " + owner.display() + ", Loan Balance: " + outstandingBalance;
    }
}
