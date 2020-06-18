package human;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {

        Human human1 = new Human("Ryan", "Gosling", 39);
        Human human2 = new Human("Amy", "Adams", 45);

        try {

            Human human3 = human1.clone();

            System.out.println("Human.toString()");
            System.out.println("================");
            System.out.println(human1.toString());
            System.out.println(human2.toString());
            System.out.println(human3.toString());
            System.out.println();

            System.out.println("Human.hashCode()");
            System.out.println("================");
            System.out.println("HashCode of Human #1 = " + human1.hashCode());
            System.out.println("HashCode of Human #2 = " + human2.hashCode());
            System.out.println("HashCode of Human #3 = " + human3.hashCode());
            System.out.println();

            System.out.println("Human.equals()");
            System.out.println("==============");
            System.out.println(human1.equals(human1));
            System.out.println(human1.equals(human2));
            System.out.println(human1.equals(human3));

        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("human.txt"));) {
            oos.writeObject(new Human("Ryan", "Reynolds", 43));
        } catch (Exception ex) {
            ex.getLocalizedMessage();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("human.txt"));) {
            Human h4 = (Human)ois.readObject();
            System.out.println();
            System.out.println(h4.toString());
        } catch (Exception ex) {
            ex.getLocalizedMessage();
        }

    }

}
