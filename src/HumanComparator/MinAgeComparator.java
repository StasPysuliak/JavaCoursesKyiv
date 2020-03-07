package HumanComparator;

import java.util.Comparator;

public class MinAgeComparator implements Comparator {

    @Override
    public int compare(Object o1,Object o2) {
        Human human1 = (Human) o1;
        Human human2 = (Human) o2;

        if(human1.getAge() < human2.getAge())
            return -1;
        else if (human1.getAge() == human2.getAge())
            return 0;
        else if (human1.getAge() > human2.getAge())
            return 1;

        return 0;
    }
}