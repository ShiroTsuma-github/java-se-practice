package pl.globallogic.exercises;

import java.util.ArrayList;

public class ex46Customer {

    private final String name;
    private final ArrayList<Double> transactions;

    public ex46Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }

    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
