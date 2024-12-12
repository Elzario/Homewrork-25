package util;

public interface PaymentModule {
    void addFunds(int amount);
    boolean deductFunds(int amount);
    int getBalance();
}
