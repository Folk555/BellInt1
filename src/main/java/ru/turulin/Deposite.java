package ru.turulin;

public class Deposite extends Product implements IDeposite {

    public Deposite(Currency currency, String productName, double balance) {
        super(currency, productName, balance);
    }

    @Override
    public String closeDeposite() {
        return "Вклад закрыт. Последняя сумма вклада: " + balance;
    }
}
