package figure;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Figures[] figures = {
                new Triangle("Triangle",5,10),
                new Square("Square",5,10),
                new Circle("Circle",5,10)
        };

        Arrays.sort(figures,new FiguresComparator());                                               //"Comparator Sort
        //Arrays.sort(figures,(figures1,figures2)-> (int) (figures2.getArea()-figures1.getArea())); //Lambda Sort

        for (Figures f : figures) {
            System.out.println(f.name + "   " + f.getArea());
        }
    }
}
