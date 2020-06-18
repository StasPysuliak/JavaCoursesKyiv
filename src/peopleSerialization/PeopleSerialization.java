package peopleSerialization;

import human.Human;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class PeopleSerialization {

    public void peopleSerialization(List<People> list) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.txt"))) {
            for (People h : list) {
                oos.writeObject(h);
            }
        }
        catch (Exception e) {
            ;
        }
    }

    public void peopleDeserialization(int numbersOfPeople,PeopleList list) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.txt"))) {
            for(int i = 0; i < numbersOfPeople; i++) {
                list.setPeopleList((People) ois.readObject());
            }
        }
        catch (Exception e) {
            ;
        }
    }

}
