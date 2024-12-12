package util;

import java.util.Scanner;

public class CardAcceptor implements PaymentModule {
    private int balance;

    @Override
    public void addFunds(int amount) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер карты для пополнения:");
        String cardNumber = scanner.nextLine();

        System.out.println("Введите одноразовый пароль для пополнения на " + amount);
        String oneTimePassword = scanner.nextLine();

        System.out.println("Пополнение на " + amount + " с карты " + cardNumber + " успешно.");
        balance += amount;
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
