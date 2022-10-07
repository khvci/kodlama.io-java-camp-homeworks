package week3.odev2.classesWithAttributes;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Laptop");
        /*
        product.name = "Laptop";
        product.id = 1;
        product.description = "Asus";
        product.price = 5000;
        product.stockAmount = 3;
         */

        Product product2 = new Product(2, "Delonghi", "Kahve Makinesi", 2000, 5);

        ProductManager productManager = new ProductManager();
        productManager.add(product);
        productManager.add(product2);
    }
}
