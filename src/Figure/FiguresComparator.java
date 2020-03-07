package Figure;

import java.util.Comparator;

public class FiguresComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Figures figure1 = (Figures) o1;
        Figures figure2 = (Figures) o2;

        if(figure1.getArea() > figure2.getArea())
            return -1;
        else if (figure1.getArea() == figure2.getArea())
            return 0;
        else if (figure1.getArea() < figure2.getArea())
            return 1;

        return 0;
    }
}
