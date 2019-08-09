package HomeworkEngineCapacity;

import HomeworkEngineCapacity.Car;

public class Main {

    public static void main(String[] args) {
        Car bmw = new Car("BMW");
        Car ferrari = new Car("Ferrari", 20000);

        bmw.turnOn();
        ferrari.turnOn();

        final  int[] speeds = new int[] {20, 60, 100};

        for (int s : speeds)
            bmw.start(s, 0.5,10);
        for (int s : speeds)
            ferrari.start(s, 1,15);

        bmw.turnOff();
        ferrari.turnOff();

        System.out.println(bmw.getName() + ": " + bmw.getMileage() + ": " + bmw.getEngCapacity());
        System.out.println(ferrari.getName() + ": " + ferrari.getMileage() + ": " + ferrari.getEngCapacity());
    }
}