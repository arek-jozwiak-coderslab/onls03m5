package pl.coderslab.day1.design;

public class MainFacade {

    public static void main(String[] args) {
        Element1 element1 = new Element1();
        element1.method1();
        Element2 element2 = new Element2();
        element2.method2();
        Element3 element3 = new Element3();
        element3.method3();
        // --------------------------
        Facade facade = new Facade();
        facade.doSth();
    }
}
