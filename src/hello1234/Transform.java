package hello1234;

import java.io.*;

public class Transform {

    String path;

    public Transform(String path) {
        this.path = path;
    }

    public void start() throws Exception {

        StringBuilder sb = new StringBuilder();
        byte[] buffer;
        int r = 0;

        try (FileInputStream in = new FileInputStream(path)) {

            buffer = new byte[(int)new File(path).length()];
            in.read(buffer);
            sb.append(new String(buffer, "UTF-8"));

            do {
                r = sb.indexOf("hello", r);
                if (r >= 0)
                    sb.replace(r, r + 5, "1234");
            } while (r >= 0);

            buffer = sb.toString().getBytes();
        }

        try(FileOutputStream out = new FileOutputStream(path);) {
            out.write(buffer);
        }
    }
}
