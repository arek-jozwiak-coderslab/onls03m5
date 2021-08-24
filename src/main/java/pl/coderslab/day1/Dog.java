package pl.coderslab.day1;

public class Dog extends Animal implements Movable, Jumpable {

    @Override
    void getSound() {
        System.out.println("bark woof");
    }

    @Override
    public void move() {
        System.out.println("move " + this.getClass().getSimpleName());
    }

    @Override
    public void jump() {

    }

}
