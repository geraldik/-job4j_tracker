package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс реализует модель данных пользовательского счет
 * @author VLAD KROTOV
 * @version 1.0
 */
public class Account {
    /**
     * Реквизиты счета пользователя
     */
    private String requisite;
    /**
     * Баланс счета пользователя
     */
    private double balance;

    /**
     * Конструктор, создающий счет пользователя
     * @param requisite реквизиты счета
     * @param balance баланс счета
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    public String getRequisite() {
        return requisite;
    }

    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}