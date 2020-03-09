package humanComparator;

import java.util.Comparator;

public class MaxAgeComparator implements Comparator <Human> {

    @Override
    public int compare(Human o1,Human o2) {
        Human human1 = o1;
        Human human2 = o2;

        if(human1.getAge() > human2.getAge())
            return -1;
        else if (human1.getAge() == human2.getAge())
            return 0;
        else if (human1.getAge() < human2.getAge())
            return 1;

        return 0;
    }
}