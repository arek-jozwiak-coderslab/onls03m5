package pl.coderslab.day1;

public abstract class Vehicle {
    private Integer maxSpeed;
    protected String model;

    public abstract void startEngine();

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Vehicle(Integer maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Class " + this.getClass().getSimpleName() +
                "  model= " + model + " speed=" + maxSpeed;
    }
}
