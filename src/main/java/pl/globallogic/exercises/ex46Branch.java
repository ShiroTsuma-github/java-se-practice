package pl.globallogic.exercises;

import java.util.ArrayList;

public class ex46Branch {

    private final String name;
    private final ArrayList<ex46Customer> customers;

    public ex46Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<ex46Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<ex46Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName) == null) {
            this.customers.add(new ex46Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }

public boolean addCustomerTransaction(String customerName, double amount) {
        ex46Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private ex46Customer findCustomer(String customerName) {
        for (int i = 0; i < this.customers.size(); i++) {
            ex46Customer checkedCustomer = this.customers.get(i);
            if (checkedCustomer.getName().equals(customerName)) {
                return checkedCustomer;
            }
        }
        return null;
    }
}
