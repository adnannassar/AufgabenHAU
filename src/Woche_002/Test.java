package Woche_002;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Test {
    public static void main(String[] args) {
        Customer customer = Customer.createCustomer("Test");

        LocalDateTime date = LocalDateTime.now();
        System.out.println(date);
    }
}
