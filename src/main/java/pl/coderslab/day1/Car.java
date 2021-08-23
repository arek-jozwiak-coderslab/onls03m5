package pl.coderslab.day1;

public class Car extends Vehicle implements Movable {


    private String type;

    public Car(Integer maxSpeed, String model, String type) {

        super(maxSpeed, model);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void startEngine() {
        System.out.println("brum brum ");
    }

    public Car(Integer maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void move() {
        System.out.println("move " + this.getClass().getSimpleName());
    }

    @Override
    public void jump() {

    }
}
