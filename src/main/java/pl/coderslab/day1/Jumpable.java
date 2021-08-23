package pl.coderslab.day1;

public interface Jumpable {
    void move();
    void jump();

    default void doSth(){
        System.out.println("Jumpable");
    }

    default void doSth2(){
        System.out.println("Jumpable");
    }

    static void ddd(){
        System.out.println("asdasda");
    }
}
