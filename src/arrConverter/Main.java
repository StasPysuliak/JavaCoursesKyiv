package arrConverter;

import java.util.ArrayList;
//Написать метод для конвертации массива строк/чисел в список.
public class Main {
    public static void main(String[] args) {

        String[] str = {"Str1","Str2","Str3","Str4","Str5","Str6","Str7",};
        Integer[] num = {1,2,3,4,5,6,7};

        ArrayList strList;
        ArrayList numList;

        strList = new Converter(str).convert();
        numList = new Converter(num).convert();

        System.out.println(strList);
        System.out.println(numList);

    }
}
