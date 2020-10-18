package hw_07_10_2020.hw_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String numberCard;
        String cardHolder, expiryDate, cvv;
        int typeCard;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер карты: ");
        numberCard = scanner.nextLine();
        System.out.println("Введите тип карты (1 - дебетовая, 2 - кредитная): ");
        typeCard = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите имя и фамилию держателя карты: ");
        cardHolder = scanner.nextLine();
        System.out.println("Введите дату окончания срока действия: ");
        expiryDate = scanner.nextLine();
        System.out.println("Введите CVV: ");
        cvv = scanner.nextLine();

        ValidateDataCard.DataValidate(numberCard, typeCard, cardHolder, expiryDate, cvv);
    }
}
