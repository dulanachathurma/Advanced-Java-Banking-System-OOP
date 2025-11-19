import model.Person;
import accounts.*;
import services.*;

    public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Dulana", 21);
        System.out.println(p1.display());


        SavingsAccount s1 = new SavingsAccount("S1", p1, 10000, 5000);
        SavingsAccount s2 = new SavingsAccount("S2", p1, 10000, 5000);


        CheckingAccount c1 = new CheckingAccount("C1", p1, 10000, 2000, 300);
        CheckingAccount c2 = new CheckingAccount("C2", p1, 10000, 2000, 300);


        SimpleInterestCalculator si = new SimpleInterestCalculator();
        CompoundInterestCalculator ci = new CompoundInterestCalculator();


        AccountServices.applyInterest(s1, si, 0.05, 12);
        AccountServices.applyInterest(s2, ci, 0.05, 12);

        AccountServices.applyInterest(c1, si, 0.05, 12);
        AccountServices.applyInterest(c2, ci, 0.05, 12);


        System.out.println("Savings Simple   : " + s1.getBalance());
        System.out.println("Savings Compound : " + s2.getBalance());
        System.out.println("Advantage (Savings): " + (s2.getBalance() - s1.getBalance()));

        System.out.println("Checking Simple   : " + c1.getBalance());
        System.out.println("Checking Compound : " + c2.getBalance());
        System.out.println("Advantage (Checking): " + (c2.getBalance() - c1.getBalance()));
    }
}
