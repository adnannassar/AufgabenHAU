package Woche_002;

public class Customer {
    private String name;

    private Customer(String name) {
        this.name = name;
    }

    public static Customer createCustomer(String name) {
        return new Customer(name);
    }
}
