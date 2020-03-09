package figure;

public abstract class Figures {
    String name;
    double width;
    double height;

    public Figures(String name, double width, double height) {
        this.name = name;
        this.width = width;
        this.height = height;
    }

    abstract double getArea();
}
