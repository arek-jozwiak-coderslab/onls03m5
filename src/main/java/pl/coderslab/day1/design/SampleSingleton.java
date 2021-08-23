package pl.coderslab.day1.design;

public class SampleSingleton {
    private static SampleSingleton INSTANCE;

    private SampleSingleton() {
        System.out.println("create obiect ");
    }

    public static SampleSingleton getInstance() {
        if (INSTANCE == null) {
            System.out.println("run get instance ob");
            INSTANCE = new SampleSingleton();
        }
        return INSTANCE;
    }
}
