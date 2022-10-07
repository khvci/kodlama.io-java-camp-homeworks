package week3.odev2.classesWithAttributes;

public class ProductManager {
    public void add(Product product) {
        System.out.println("Urun eklendi: "
                + product.getName() + " "
                + product.getCode());
    }
}
