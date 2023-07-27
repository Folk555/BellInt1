package ru.turulin;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Класс описывающий абстрактный банковский продукт
 */
@AllArgsConstructor
@Getter
public abstract class Product {
    protected Currency currency;
    protected String productName;
    protected double balance;

    /**
     * Пополнение баланса
     * @param value - сумма пополнения
     * @return баланс после пополнения
     */
    public double topUpBalance(double value) {
        balance += value;
        return balance;
    }

}
