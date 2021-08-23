package pl.coderslab.day1.design;

public class MainObservers {

    public static void main(String[] args) {
        ConcreteObserver concreteObserver = new ConcreteObserver();
        NoConcreteObserver noConcreteObserver = new NoConcreteObserver();

        Subject concreteSubject = new ConcreteSubject();

        concreteSubject.attach(concreteObserver);
        concreteSubject.attach(noConcreteObserver);

        //  ---------

        concreteSubject.notifyObservers();

        concreteSubject.detach(noConcreteObserver);
        System.out.println("----------------");

        concreteSubject.notifyObservers();

    }
}
