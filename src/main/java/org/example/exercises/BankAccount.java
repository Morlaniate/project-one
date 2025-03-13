package org.example.exercises;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class BankAccount {

    private long accountNumber;
    private String accountCurrency; //"eur" или "usd"
    private double balance;

    // 1 eur = 1.2 usd

    public void deposit(String currency, double amount) {
        if (!currency.equals(accountCurrency) && currency.equals("eur")) {
            amount = 1.2 * amount;
        } else if ((!currency.equals(accountCurrency) && currency.equals("usd"))) {
            amount = amount / 1.2;
        }
        balance += amount;
    }

    public void withdraw(String currency, double amount) throws IllegalArgumentException {

        if (amount > balance) throw new IllegalArgumentException("Insufficient funds");

        if (!currency.equals(accountCurrency) && currency.equals("eur")) {
            amount = 1.2 * amount;
        } else if ((!currency.equals(accountCurrency) && currency.equals("usd"))) {
            amount = amount / 1.2;
        }

        if (amount > balance) throw new IllegalArgumentException("Insufficient funds");

        balance -= amount;
    }

}
