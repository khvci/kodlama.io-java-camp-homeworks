package week3.odev1.service;

import week3.odev1.entities.Customer;

public class CustomerManager {
    private Customer customer;
    private CreditManager creditManager;

    public CustomerManager(Customer customer, CreditManager creditManager) {
        this.customer = customer;
        this.creditManager = creditManager;
    }

    public void save() {
        System.out.println("Kaydedildi: ");
    }

    public void delete() {
        System.out.println("Silindi: ");
    }

    public void giveCredit() {
        creditManager.calculate();
        System.out.println("Kredi verildi.");
    }
}
