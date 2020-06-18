package peopleSerialization;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<People> list = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Please enter: Name SurName and age");
                System.out.println("Example: Ryan Reynolds 43");
                String peopleData = bf.readLine();
                list.add(new People(peopleData.split(" ")[0], peopleData.split(" ")[1],
                                    Integer.parseInt(peopleData.split(" ")[2])));
            }
            catch (Exception e) {
                ;
            }
        }
        System.out.println(list);

    }
}
