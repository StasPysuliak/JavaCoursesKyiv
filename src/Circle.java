import static java.lang.StrictMath.PI;

public class Circle {

    int r;

    public Circle() {

    };

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public double area() {
       return PI*r*r;
    };
}
