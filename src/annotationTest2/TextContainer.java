package annotationTest2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.annotation.Retention;

public class TextContainer {

    static final String text = "bla bla bla";

    @Saver
    @SaveTo (path = "C:\\Users\\Stanislav\\Desktop\\1.txt")
    public static void save (String path) {
        try (FileWriter fw = new FileWriter(path)) {
            fw.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
