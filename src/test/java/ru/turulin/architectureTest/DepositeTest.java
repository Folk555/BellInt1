package ru.turulin.architectureTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.turulin.Currency;
import ru.turulin.Deposite;

public class DepositeTest {

    Currency currency = Currency.RUB;
    String productName = "Средний";
    int balance = 150000;

    //Карты и вклад имеют параметры: валюта, баланс и название

    @Test
    void getCurrency() {
        Deposite deposite = new Deposite(currency, productName, balance);

        Assertions.assertEquals(currency, deposite.getCurrency());
    }
    @Test
    void getBalance() {
        Deposite deposite = new Deposite(currency, productName, balance);

        Assertions.assertEquals(balance, deposite.getBalance());
    }
    @Test
    void getProductName() {
        Deposite deposite = new Deposite(currency, productName, balance);

        Assertions.assertEquals(productName, deposite.getProductName());
    }

    //Вклад содержит методы: пополнение, запрос баланса, закрытие

    @Test
    void topUpBalance() {
        Deposite deposite = new Deposite(currency, productName, balance);
        double topUpSum = 1000;

        deposite.topUpBalance(topUpSum);

        Assertions.assertEquals(balance+topUpSum, deposite.getBalance());
    }

    @Test
    void closeDeposite() {
        Deposite deposite = new Deposite(currency, productName, balance);

        String expected = "Вклад закрыт. Последняя сумма вклада: " + (double)balance;
        Assertions.assertEquals(expected, deposite.closeDeposite());
    }



}
