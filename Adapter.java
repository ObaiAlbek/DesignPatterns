package DesignPatterns;

public class Adapter {

	public static void main(String[] args) {
        Vehicle car = new Car();

        Vehicle bicycle = new BicycleAdapter(new Bicycle());

        playWithVehicle(car);

        playWithVehicle(bicycle);
    }

    private static void playWithVehicle(Vehicle vehicle) {

        vehicle.accelerate();
        vehicle.pushBreak();
        vehicle.soundHorn();
        System.out.println("\n");
    }
}

interface Vehicle {

    void accelerate();
    void pushBreak();
    void soundHorn();
}

class Car implements Vehicle {

    @Override
    public void accelerate() {
        System.out.println("Car starts to move");
    }

    @Override
    public void pushBreak() {
        System.out.println("Car Stopped");
    }

    @Override
    public void soundHorn() {
        System.out.println("Beeb Beep");
    }
}

class Bicycle {

    public void pedal(){
        System.out.println("Bic starts to move");
    }

    public void stop() {
        System.out.println("Bic stopped");
    }

    public void ringBell() {
        System.out.println("Ring ring");
    }
}


class BicycleAdapter implements Vehicle {
    private Bicycle bicycle;


    public BicycleAdapter(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    public void accelerate() {
        bicycle.pedal();
    }

    @Override
    public void pushBreak() {
        bicycle.stop();
    }

    @Override
    public void soundHorn() {
        bicycle.ringBell();
    }
}