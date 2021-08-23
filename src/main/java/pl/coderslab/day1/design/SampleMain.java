package pl.coderslab.day1.design;

public class SampleMain {

    public static void main(String[] args) {
        SampleSingleton instance = SampleSingleton.getInstance();
        SampleSingleton instance2 = SampleSingleton.getInstance();
        SampleSingleton instance3 = SampleSingleton.getInstance();
        System.out.println(instance);
        System.out.println(instance2);
        System.out.println(instance3);

    }
}
