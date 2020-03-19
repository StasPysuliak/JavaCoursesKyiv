package copyFiles;

import java.io.*;

public class CopyFilesSecondWay {

    String is;
    String out;

    public void setIs(String is) {
        this.is = is;
    }

    public void setOut(String out) {
        this.out = out;
    }

    public void copy() throws Exception {
        File source = new File(is);
        File dest = new File(out);

        try (InputStream is = new FileInputStream(source);
             OutputStream os = new FileOutputStream(dest)) {

            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        }
    }
}
