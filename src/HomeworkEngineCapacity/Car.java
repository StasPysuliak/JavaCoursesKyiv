package HomeworkEngineCapacity;

public class Car {
    private String name;
    private Engine engine;

    public Car(String name) {
        this.name = name;
        engine = new Engine(0);
    }

    public Car(String name,double mileage) {
        this.name = name;
        engine = new Engine(mileage);
    }

    public String getName() {
        return name;
    }

    public double getMileage() {
        return engine.getMileage();
    }
    // HomeWork------------------------
    public  double getEngCapacity() {
        return engine.getEngCapacity();
    }
    // HomeWork------------------------
    public  void turnOn() {
        engine.turnOn();
    }

    public  void turnOff() {
        engine.turnOff();
    }

    public void start(int speed, double hours,double engCapacity) {
        if (engine.isStarted()) {
            double distance = hours * speed;
            engine.setMileage(distance);
            //HomeWork-----------------------------
            double fuel = engCapacity*distance/100;
            engine.setEngCapacity(fuel);
            //HomeWork-----------------------------
        }
    }
}
