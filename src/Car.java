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

    public  void turnOn() {
        engine.turnOn();
    }

    public  void turnOff() {
        engine.turnOff();
    }

    public double wastedFule() {
        return engine.getEngineCapacity();
    }

    public void start(int speed, double hours,double engineCapacity) {
        if (engine.isStarted()) {
            double distance = hours * speed;
            engine.setMileage(distance);
            engine.setEngineCapacity(distance*engineCapacity/100);
        }
    }
}
