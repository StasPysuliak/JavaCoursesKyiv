package translator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DictionarySerialization {
    public void dictionarySerialization (Dictionary dictionary,String path) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            oos.writeObject(dictionary);
        }
        catch (Exception e) {
            e.getMessage();
        }
    }
    public Dictionary dictionaryDeserialization (String path) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            return (Dictionary) ois.readObject();
        }
        catch (Exception e) {
            e.getMessage();
            return null;
        }

    }
}
