package accounts;

public interface Account {


    void credit(double amount);
    void debit(double amount);
    double getBalance();
    String getAccountInfo();
}
