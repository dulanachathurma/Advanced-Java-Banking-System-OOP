package services;

public class CompoundInterestCalculator implements InterestCalculator {

    @Override
    public double calculate(double balance, double annualRate, int months) {

        double t = months / 12.0;
        int n = 12;
        return balance * Math.pow((1 + annualRate / n), n * t) - balance;
    }
}
