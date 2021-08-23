package pl.coderslab.day1.design;

public class MainLoop {

    public static void main(String[] args) {

        String s = "";
        for (int i = 0; i < 1000000; i++) {
            s += i;
        }

        System.out.println("finish");
    }
}
