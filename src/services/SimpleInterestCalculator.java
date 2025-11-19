package services;

public class SimpleInterestCalculator implements InterestCalculator {

    @Override
    public double calculate(double balance, double annualRate, int months) {

        double t = months / 12.0;

        return balance * annualRate * t;
    }
}
