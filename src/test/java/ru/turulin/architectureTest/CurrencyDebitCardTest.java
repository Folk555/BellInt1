package ru.turulin.architectureTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.turulin.Currency;
import ru.turulin.DebitCard;

public class CurrencyDebitCardTest {

    Currency currency = Currency.EUR;
    String productName = "Европейская";
    int balance = 420;

    //Карты и вклад имеют параметры: валюта, баланс и название

    @Test
    void getCurrency() {
        DebitCard debitCard = new DebitCard(currency, productName, balance);

        Assertions.assertEquals(currency, debitCard.getCurrency());
    }
    @Test
    void getBalance() {
        DebitCard debitCard = new DebitCard(currency, productName, balance);

        Assertions.assertEquals(balance, debitCard.getBalance());
    }
    @Test
    void getProductName() {
        DebitCard debitCard = new DebitCard(currency, productName, balance);

        Assertions.assertEquals(productName, debitCard.getProductName());
    }

    //- Карты содержат методы: пополнение, списание, запрос баланса

    @Test
    void topUpBalance() {
        DebitCard debitCard = new DebitCard(currency, productName, balance);
        double topUpSum = 31;

        debitCard.topUpBalance(topUpSum);

        Assertions.assertEquals(balance+topUpSum, debitCard.getBalance());
    }

    @Test
    void writeOff() {
        DebitCard debitCard = new DebitCard(currency, productName, balance);
        double writeOffSum = 29;

        debitCard.writeOff(writeOffSum);

        Assertions.assertEquals(balance-writeOffSum, debitCard.getBalance());
    }

}
