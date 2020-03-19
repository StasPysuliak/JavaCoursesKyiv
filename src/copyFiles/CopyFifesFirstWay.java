package copyFiles;

import java.io.File;
import java.nio.file.Files;

public class CopyFifesFirstWay {

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

        Files.copy(source.toPath(),dest.toPath());
    }
}
