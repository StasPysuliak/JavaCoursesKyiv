package arraysManipulation;

import java.util.ArrayList;
import java.util.List;
//Написать метод, который создаст список, положит в него 10 элементов,
// затем удалит первые два и последний, а затем выведет результат на экран.
public class Main {
    public static void main(String[] args) {

        List list = new ArrayList();

        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        System.out.println(list);

        list.subList(0,2).clear();
        list.remove(list.size()-1);

        System.out.println(list);

    }
}
