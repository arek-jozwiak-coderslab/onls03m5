package pl.coderslab.day1.design;

public class ConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println("I am updated ConcreteObserver");
    }
}
