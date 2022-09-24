package week2.classes;

public class Main {
    public static void main(String[] args) {
        //class -> reference type
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2; //heap'te olusturulmus ilk instance garbage collector tarafindan silinir.
        customerManager.addCustomer();
        customerManager.updateCustomer();
        customerManager.removeCustomer();

        //referance types vs value types
        int num1 = 10;
        int num2 = 20;
        num2 = num1;
        num1 = 30;
        System.out.println(num2); //prints 10. primitive int is a value type.

        int[] numbers1 = new int[]{1,2,3};
        int[] numbers2 = new int[]{4,5,6};
        numbers2 = numbers1;
        numbers1[0] = 10;
        System.out.println(numbers2[0]); //prints 10. collection is a reference type.
    }
}
