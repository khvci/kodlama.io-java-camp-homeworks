package week3.odev2.staticDemo;

public class ProductValidator {
    public ProductValidator() {
        System.out.println("Yapici blok calisti."); // statikte calismaz, sadece newlenince calisir
    }

    static {
        System.out.println("Statik blok calisti");
    }
    public static boolean isValid(Product product) {
        return product.price > 0 && !product.name.isEmpty();
    }
    public void instanceMethod() {
        System.out.println("Instance method calisti.");
    }
}
