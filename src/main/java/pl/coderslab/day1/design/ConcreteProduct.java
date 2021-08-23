package pl.coderslab.day1.design;

public class ConcreteProduct implements Creator {
    @Override
    public Product createProduct(String type) {
        switch (type) {
            case "product1":
                return new Product1();
            case "product2":
                return new Product2();
            default:
                return null;
        }

    }
}
