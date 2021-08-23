package pl.coderslab.day1.design;

public class NoConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println("I am updated NoConcreteObserver");
    }
}
