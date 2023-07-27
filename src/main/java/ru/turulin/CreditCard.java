package ru.turulin;

import lombok.Getter;

/**
 * В рамках кредитной карты под balance подразумевается сумма кредита или "баланс кредита"
 */
public class CreditCard extends Product implements ICard {

    /**
     * Процентная ставка задается абсолютным числом, т.е. кредит под 5% соответствует interestRate = 0.05
     */
    @Getter
    private double interestRate;

    /**
     * Конструктор-рудимент от родительского класса.
     * Использовать надо другой, где есть interestRate аргумент.
     */
    private CreditCard(Currency currency, String productName, double balance) {
        super(currency, productName, balance);
    }

    public CreditCard(Currency currency, String productName, double balance, double interestRate) {
        super(currency, productName, balance);
        this.interestRate = interestRate;
    }

    /**
     * Под списание подразумевается пополнение кредитного тела
     * @param value сумма списания
     */
    @Override
    public void writeOff(double value) {
        balance+=value;
    }

    /**
     * Математика вычисление задолженности носит условный характер.
     * @return сумма задолженности по кредиту
     */
    public double getLoanDebt() {
        return balance + (balance * interestRate);
    }

}
