package developer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Developer[] list = {
                new JuniorDeveloper("Mike", 500, 0),
                new JuniorDeveloper("Dima", 500, 1),
                new JuniorDeveloper("Vova", 500, 2),
                new SeniorDeveloper("Jack", 500, 5),
                new TeamLeadDeveloper("Robby", 500, 7)
        };
        ArrayList junior   = new ArrayList();
        ArrayList senior   = new ArrayList();
        ArrayList teamLead = new ArrayList();
        //Arrays.sort(list, (dev1 , dev2) -> (int)(dev2.getSalary() - dev1.getSalary()));
        StringBuilder sb;
        for (Developer d : list) {
            sb = new StringBuilder()
                    .append(d.getName())
                    .append(": ")
                    .append(d.getBasicSalary())
                    .append(" -> ")
                    .append(d.getSalary());

            if (d.getSalary()>1500 && d instanceof SeniorDeveloper) System.out.println(sb.toString());

            if (d instanceof JuniorDeveloper)
                junior.add(sb);
            else if (d instanceof SeniorDeveloper)
                senior.add(sb);
            else if (d instanceof TeamLeadDeveloper)
                teamLead.add(sb);
        }
        System.out.println(junior.toString());
        System.out.println(senior.toString());
        System.out.println(teamLead.toString());
    }
}
