package week3.odev1;

import week3.odev1.entities.CommercialCustomer;
import week3.odev1.entities.Customer;
import week3.odev1.entities.IndividualCustomer;
import week3.odev1.service.CreditManager;
import week3.odev1.service.CustomerManager;
import week3.odev1.service.MilitaryCreditManager;
import week3.odev1.service.TeacherCreditManager;


public class Main {
    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = 20;
        sayi1 = sayi2;
        sayi2 = 100;
        System.out.println(sayi1); //prints 20

        int[] sayilar1 = new int[]{1,2,3};
        int[] sayilar2 = new int[]{10,20,30};
        sayilar1 = sayilar2;
        sayilar2[0] = 1000;
        System.out.println(sayilar1[0]); //prints 1000

        CreditManager creditManager = new TeacherCreditManager();
        creditManager.calculate();
        creditManager.save();

        IndividualCustomer customer = new IndividualCustomer();
        customer.id = 1;
        customer.firstName = "Ahmet";
        customer.lastName = "Yilmaz";
        customer.nationalID = "12345";
        customer.city = "Ankara";

        CommercialCustomer commercialCustomer = new CommercialCustomer();
        commercialCustomer.taxNumber = "555";
        commercialCustomer.companyName = "Arcelik";
        commercialCustomer.id = 100;

        CustomerManager customerManager = new CustomerManager(customer, new MilitaryCreditManager());
        customerManager.save();
        customerManager.delete();
        customerManager.giveCredit();


        Customer[] array = new Customer[]{commercialCustomer, customer};
        for (Customer c: array) {
            System.out.println(c.id);
        }

    }
}

