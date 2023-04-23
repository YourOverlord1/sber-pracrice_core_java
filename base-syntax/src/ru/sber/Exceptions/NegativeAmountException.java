package ru.sber.Exceptions;

public class NegativeAmountException extends BankOnlineException {
    public NegativeAmountException() {
        super("Сумма перевода должна быть положительной.");
    }
}
