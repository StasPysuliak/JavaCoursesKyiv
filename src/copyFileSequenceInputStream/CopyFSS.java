package copyFileSequenceInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class CopyFSS {

    String is1;
    String is2;
    String out;

    public void setIs1(String is1) {
        this.is1 = is1;
    }

    public void setIs2(String is2) {
        this.is2 = is2;
    }

    public void setOut(String out) {
        this.out = out;
    }

    public void start() throws Exception {

        try (FileInputStream source1 = new FileInputStream(is1);
             FileInputStream source2 = new FileInputStream(is2);
             FileOutputStream dest = new FileOutputStream(out);
             SequenceInputStream sis = new SequenceInputStream(source1,source2)) {

            int i = 0;
            while((i=sis.read())!=-1)
            {
                dest.write(i);
            }

        }
    }
}
