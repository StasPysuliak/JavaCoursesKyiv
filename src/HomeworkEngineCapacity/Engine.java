package HomeworkEngineCapacity;

public class Engine {
    private double mileage;
    private boolean started;
    private double engCapacity;             //Об'єм двигуна л/100км

    public Engine(double mileage) {
        this.mileage = mileage;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        if (started)
            this.mileage += mileage;
    }
    // HomeWork ---------------------------------------
    public double getEngCapacity() {
        return engCapacity;
    }

    public void setEngCapacity(double engCapacity) {
        this.engCapacity += engCapacity;
    }
    // HomeWork ----------------------------------------
    public boolean isStarted() {
        return started;
    }

    public  void turnOn() {
        started = true;
    }

    public void turnOff() {
        started = false;
    }
}
