package ru.turulin;

public class DebitCard extends Product implements ICard {
    public DebitCard(Currency currency, String productName, double balance) {
        super(currency, productName, balance);
    }

    @Override
    public void writeOff(double value) {
        balance-=value;
    }
}
