package figure;

public class Circle extends Figures {

    public Circle(String name, double width, double height) {
        super(name, width, height);
    }

    @Override
    double getArea() {
        double radius = width + height;
        double area = Math.PI * radius * radius;
        return area;
    }
}
