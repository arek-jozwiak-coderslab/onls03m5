package pl.coderslab.day1.design;

public class Facade {

    private Element1 element1;
    private Element2 element2;
    private Element3 element3;

    public Facade() {
        this.element1 = new Element1();
        this.element2 = new Element2();
        this.element3 = new Element3();
    }
    public void doSth(){
        this.element1.method1();
        this.element2.method2();
        this.element3.method3();
    }
}
