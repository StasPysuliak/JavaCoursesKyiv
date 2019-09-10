package HomeworkEngineCapacity;

public class Engine {
    private double  mileage;
    private boolean started;
    private double EngineCapacity;

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

    public double getEngineCapacity() {
        return EngineCapacity;
    }

    public void setEngineCapacity(double EngineCapacity) {
        this.EngineCapacity += EngineCapacity;
    }

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
