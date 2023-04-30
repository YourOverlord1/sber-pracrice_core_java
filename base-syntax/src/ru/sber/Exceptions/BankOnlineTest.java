package ru.sber.Exceptions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankOnlineTest {
    @Test
    void testSend_withNullCardNumber_throwsException() {
        BankOnline bank = new BankOnline();
        assertThrows(BankOnlineException.class, () -> bank.send(null, 1000.0));
    }

    @Test
    void testSend_withNullMoney_throwsException() {
        BankOnline bank = new BankOnline();
        assertThrows(BankOnlineException.class, () -> bank.send("1111222233334444", null));
    }

    @Test
    void testSend_withInvalidCardNumber_throwsException() {
        BankOnline bank = new BankOnline();
        assertThrows(InvalidCardNumberException.class, () -> bank.send("123", 1000.0));
    }

    @Test
    void testSend_withBlockedCardNumber_throwsException() {
        BankOnline bank = new BankOnline();
        assertThrows(BlockedCardException.class, () -> bank.send("1111111111111111", 1000.0));
    }

    @Test
    void testSend_withNegativeAmount_throwsException() {
        BankOnline bank = new BankOnline();
        assertThrows(NegativeAmountException.class, () -> bank.send("1111222233334444", -1000.0));
    }

    @Test
    void testSend_withExceedingLimit_throwsException() {
        BankOnline bank = new BankOnline();
        assertThrows(ExceededLimitException.class, () -> bank.send("1111222233334444", 60000.0));
    }

    @Test
    void testSend_withValidData_performsTransfer() throws BankOnlineException {
        BankOnline bank = new BankOnline();
        assertDoesNotThrow(() -> bank.send("1111222233334444", 1000.0));
    }
}