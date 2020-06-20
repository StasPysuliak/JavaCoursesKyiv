package dublicate;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
//Пользователь вводит набор чисел в виде одной строки (“1, 2, 3, 4, 4,5”).
//Избавиться от повторяющихся элементов в строке и вывести результат на экран.
public class DuplicateTwo {
    public static void main(String[] args) {

        System.out.println("Please, enter a string (example: " + "1, 2, 3, 4, 4, 5" + "): ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Character> hs = new HashSet<>();
        try {
            String s = br.readLine();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isDigit(c))
                    hs.add(c);
            }
            System.out.println(hs);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
