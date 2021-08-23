package pl.coderslab.day1;

public class Snake implements Jumpable, Movable{

    @Override
    public void move() {

    }

    @Override
    public void jump() {

    }
    @Override
    public void doSth(){
        System.out.println("dosth from Snake");
        Jumpable.ddd();
    }
}
