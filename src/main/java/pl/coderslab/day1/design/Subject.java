package pl.coderslab.day1.design;


public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}
