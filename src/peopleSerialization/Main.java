package peopleSerialization;


import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
//Написать программу, которая запросит ввести с консоли информацию о 10 людях, запишет ее на диск, а при следующем
//старте прочитает записи и выведет сохраненные данные на экран
public class Main {
    public static void main(String[] args) {
        PeopleList peopleList = new PeopleList();

        File humanFile = new File("people.txt");
        if (humanFile.exists() && humanFile.isFile() && (humanFile.length() > 0)) {
            new PeopleSerialization().peopleDeserialization(2,peopleList);
            System.out.println(peopleList.getPeopleList());
        }
        else {
            peopleList.peopleMaker();
            new PeopleSerialization().peopleSerialization(peopleList.getPeopleList());

        }
    }
}
