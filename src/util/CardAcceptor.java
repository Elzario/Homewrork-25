package util;

public class CardAcceptor implements PaymentModule {
    private int balance;

    @Override
    public void addFunds(int amount) {
        System.out.println("Введите номер карты и одноразовый пароль для пополнения на " + amount);
        balance += amount; // Симуляция успешной транзакции
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
