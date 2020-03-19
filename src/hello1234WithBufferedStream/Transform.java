package hello1234WithBufferedStream;

import java.io.*;

public class Transform {

    String path;

    public Transform(String path) {
        this.path = path;
    }

    public void start() throws Exception {

        StringBuilder sb = new StringBuilder();
        File f = new File(path);

            try (
                    FileInputStream fis = new FileInputStream(path);
                    InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
                    BufferedReader br = new BufferedReader(isr)) {

                while(sb.length() < f.length()) {
                    sb.append(br.readLine()).append("\n");
                }

                int r = 0;
                do {
                    r = sb.indexOf("Hello", r);
                    if (r >= 0)
                        sb.replace(r, r + 5, "1234");
                } while (r >= 0);
            }

            try (
                    FileOutputStream fos = new FileOutputStream(path);
                    OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
                    BufferedWriter bw = new BufferedWriter(osw)) {
                bw.write(sb.toString());
            }
    }
}
