package ru.turulin.architectureTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.turulin.CreditCard;
import ru.turulin.Currency;

public class CreditCardTest {

    Currency currency = Currency.RUB;
    String productName = "Кредит-малыш";
    int balance = 20000;
    double interestRate = 0.023;

    //Карты и вклад имеют параметры: валюта, баланс и название

    @Test
    void getCurrency() {
        CreditCard creditCard = new CreditCard(currency, productName, balance, interestRate);

        Assertions.assertEquals(currency, creditCard.getCurrency());
    }
    @Test
    void getBalance() {
        CreditCard creditCard = new CreditCard(currency, productName, balance, interestRate);

        Assertions.assertEquals(balance, creditCard.getBalance());
    }
    @Test
    void getProductName() {
        CreditCard creditCard = new CreditCard(currency, productName, balance, interestRate);

        Assertions.assertEquals(productName, creditCard.getProductName());
    }

    //- Карты содержат методы: пополнение, списание, запрос баланса

    @Test
    void topUpBalance() {
        CreditCard creditCard = new CreditCard(currency, productName, balance, interestRate);
        double topUpSum = 1000;

        creditCard.topUpBalance(topUpSum);

        Assertions.assertEquals(balance+topUpSum, creditCard.getBalance());
    }

    @Test
    void writeOff() {
        CreditCard creditCard = new CreditCard(currency, productName, balance, interestRate);
        double writeOffSum = 1000;

        creditCard.writeOff(writeOffSum);

        Assertions.assertEquals(balance+writeOffSum, creditCard.getBalance());
    }

    /*
    - Кредитная карта имеет дополнительный метод запрос задолженности и дополнительный параметр процентная ставка
     */
    @Test
    void getInterestRate() {
        CreditCard creditCard = new CreditCard(currency, productName, balance, interestRate);

        Assertions.assertEquals(interestRate, creditCard.getInterestRate());
    }

    @Test
    void getLoanDebt() {
        CreditCard creditCard = new CreditCard(currency, productName, balance, interestRate);
        double debt = balance + (balance * interestRate);

        Assertions.assertEquals(debt, creditCard.getLoanDebt());
    }


}
