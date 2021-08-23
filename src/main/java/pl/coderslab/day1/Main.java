package pl.coderslab.day1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Train(300, "Pendolino"));
        vehicles.add(new Car(140, "VW Passat"));

        for (Vehicle vehicle : vehicles) {
            vehicle.startEngine();
            System.out.println(vehicle);
        }
    }
}
