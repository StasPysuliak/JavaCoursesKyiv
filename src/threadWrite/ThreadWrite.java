package threadWrite;

import java.io.RandomAccessFile;

public class ThreadWrite implements Runnable {
    private String path;
    private String text;
    RandomAccessFile raf;
    public ThreadWrite() {
    }

    public ThreadWrite(String path, String text) {
        this.path = path;
        this.text = text;
    }

    @Override
    public void run() {
        synchronized (this) {
            try {
                raf = new RandomAccessFile(path, "rw");
                raf.seek(raf.length());
                raf.write(text.getBytes());
            }
            catch (Exception e) {
                ;
            }

        }
    }
}
