package week3.odev2.staticDemo;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.name = "Mouse";
        product.price = 10;

        productManager.add(product);

        ProductValidator productValidator = new ProductValidator();
        productValidator.instanceMethod();

        DbHelper.Crud.update(); //static inner class methodunu cagirdik
        DbHelper.Crud.delete();
    }
}
