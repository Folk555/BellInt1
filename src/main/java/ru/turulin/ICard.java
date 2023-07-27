package ru.turulin;

/**
 * Интерфейс описывает возможность списание денег со счета/баланса.
 * Согласно ТЗ применимо лишь к картам
 */
public interface ICard {
    /**
     * @param value сумма списания
     */
    void writeOff(double value);
}
