package Figure;

public class Triangle extends Figures {

    public Triangle(String name, double width, double height) {
        super(name, width, height);
    }

    @Override
    double getArea() {
        double area = (height * width)/2;
        return area;
    }
}
