package pl.coderslab.day1;

public class Train extends Vehicle {

    private int trackWidth;

    public int getTrackWidth() {
        return trackWidth;
    }

    public void setTrackWidth(int trackWidth) {
        this.trackWidth = trackWidth;
    }

    public Train(Integer maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void startEngine() {
        System.out.println("puff puff");
    }
}
