package Figure;

public class Square extends Figures {

    public Square(String name, double width, double height) {
        super(name, width, height);
    }

    @Override
    double getArea() {
        double area = height * height;
        return area;
    }
}
