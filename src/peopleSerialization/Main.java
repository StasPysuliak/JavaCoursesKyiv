package peopleSerialization;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        List<People> list = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            try {
                list.add(new People(bf.readLine(), bf.readLine(), Integer.parseInt(bf.readLine())));
            }
            catch (Exception e) {
                ;
            }
        }
        System.out.println(list.toString());

    }
}
