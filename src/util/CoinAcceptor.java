package util;

public class CoinAcceptor implements PaymentModule {
    private int balance;

    @Override
    public void addFunds(int amount) {
        balance += amount;
        System.out.println("Вы пополнили баланс на " + amount);
    }

    @Override
    public boolean deductFunds(int amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public int getBalance() {
        return balance;
    }
}