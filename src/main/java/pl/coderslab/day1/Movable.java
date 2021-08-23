package pl.coderslab.day1;

public interface Movable {

    void move();
    void jump();

    default void doSth(){
        System.out.println("Movable");
    }
}
