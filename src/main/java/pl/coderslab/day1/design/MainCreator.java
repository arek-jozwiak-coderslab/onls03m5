package pl.coderslab.day1.design;

public class MainCreator {
    public static void main(String[] args) {
        ConcreteProduct concreteProduct = new ConcreteProduct();

        Product product1 = concreteProduct.createProduct("product1");
        Product product2 = concreteProduct.createProduct("product2");
    }
}
