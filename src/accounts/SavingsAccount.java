package accounts;

import model.Person;

public class SavingsAccount extends DepositAccount {

    private final double withdrawalLimit;

    public SavingsAccount(String id, Person owner, double balance, double withdrawalLimit){
        super(id, owner, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void withdraw(double amount) {
        if(amount > withdrawalLimit){
            System.out.println("Error: Above withdrawal limit!");
            return;
        }
        if(amount > balance){
            System.out.println("Error: Insufficient balance!");
            return;
        }
        debit(amount);
    }
}
