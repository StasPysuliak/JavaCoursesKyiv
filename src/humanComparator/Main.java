package humanComparator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Human[] list = {
                new Human(40), new Human(20), new Human(3), new Human(7)};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sort by min or max");
        String comp = scanner.nextLine();

        if (comp.equals("min")) {
            //Arrays.sort(list, new MinAgeComparator());                            //Comparator Sort
            Arrays.sort(list,(list1,list2)->(int) list1.getAge()-list2.getAge()); //Lambda Sort
        }
        if (comp.equals("max")) {
            Arrays.sort(list,new MaxAgeComparator());                              //Comparator Sort
            //Arrays.sort(list,(list1,list2)->(int) list2.getAge()-list1.getAge());  //Lambda Sort
        }
        for (Human h :list)
            System.out.println(h.getAge());
    }
}
