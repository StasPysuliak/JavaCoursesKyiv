package HumanComparator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Human[] list = {
                new Human(40), new Human(20), new Human(3), new Human(7)};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sort by min or max");
        String comp = scanner.next();

        if (comp == "min")
            Arrays.sort(list,new MinAgeComparator());
        else if (comp == "max")
            Arrays.sort(list,new MaxAgeComparator());

        for (Human h :list)
            System.out.println(h.getAge());
    }
}
