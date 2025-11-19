package services;

import accounts.DepositAccount;

public class AccountServices {

    public static void applyInterest(DepositAccount account,
                                     InterestCalculator calculator,
                                     double annualRate, int months)
    {
        double interest = calculator.calculate(account.getBalance(), annualRate, months);
        account.deposit(interest);
    }
}
