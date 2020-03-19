package fileInfo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;

public class FileInfo {
    String is;
    String out;

    public void setIs(String is) {
        this.is = is;
    }

    public void setOut(String out) {
        this.out = out;
    }

    public void start() throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        StringBuilder sb = new StringBuilder();
        File sourse = new File(is);

        try (FileOutputStream de = new FileOutputStream(out);
             PrintStream dest = new PrintStream(de)
        ) {

            for(File f: sourse.listFiles()) {

                if (f.getCanonicalPath().equals(out)) continue;

                dest.print("Name: ");
                dest.print(f.getCanonicalPath());
                dest.print(" | Date of create: ");
                dest.println(sdf.format(f.lastModified()));
            }
        }
    }
}
