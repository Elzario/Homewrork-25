import util.CardAcceptor;
import util.CoinAcceptor;
import util.PaymentModule;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выберите тип платежного модуля:");
        System.out.println("1 - Монетоприемник");
        System.out.println("2 - Карто-приемник");
        int choice = new Scanner(System.in).nextInt();
        PaymentModule paymentModule;
        if (choice == 1) {
            paymentModule = new CoinAcceptor();
        } else if (choice == 2) {
            paymentModule = new CardAcceptor();
        } else {
            System.out.println("Неверный выбор. Используется монетоприемник по умолчанию.");
            paymentModule = new CoinAcceptor();
        }
        AppRunner.run(paymentModule);
    }
}