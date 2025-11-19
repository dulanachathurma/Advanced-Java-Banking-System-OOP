package accounts;

import model.Person;

public class CheckingAccount extends DepositAccount {

    private final double overdraftLimit;
    private final double overdraftFee;

    public CheckingAccount(String id, Person owner, double balance,
                           double overdraftLimit, double overdraftFee){
        super(id, owner, balance);
        this.overdraftLimit = overdraftLimit;
        this.overdraftFee = overdraftFee;
    }

    @Override
    public void withdraw(double amount) {

        if (amount <= balance) {
            debit(amount);
        } else {
            double overdraftNeeded = amount - balance;

            if (overdraftNeeded > overdraftLimit) {
                System.out.println("Error: Overdraft limit exceeded!");
                return;
            }

            debit(amount);
            debit(overdraftFee);
        }
    }
}
