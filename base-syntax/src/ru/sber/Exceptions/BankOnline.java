package ru.sber.Exceptions;

public class BankOnline {
    private static final String[] BLOCKED_CARDS = {"1111111111111111", "2222222222222222", "3333333333333333"};
    private static final double TRANSFER_LIMIT = 50000;

    public void send(String cardNumber, Double money) throws BankOnlineException {
        // Проверка на null-аргументы
        if (cardNumber == null) {
            throw new NullArgumentException("Card number");
        }
        if (money == null) {
            throw new NullArgumentException("Money");
        }

        // Проверка корректности номера карты
        if (!cardNumber.matches("\\d{16}")) {
            throw new InvalidCardNumberException();
        }

        // Проверка, что карта не заблокирована
        for (String blockedCard : BLOCKED_CARDS) {
            if (blockedCard.equals(cardNumber)) {
                throw new BlockedCardException();
            }
        }
        // Проверка, что сумма перевода не отрицательная
        if (money < 0) {
            throw new NegativeAmountException();
        }

        // Проверка, что сумма перевода не превышает лимит
        if (money > TRANSFER_LIMIT) {
            throw new ExceededLimitException();
        }
    }
}
