package Monitor;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Monitor {

    String file;
    int numberOfFiles1 = 0;
    int numberOfFiles2 = 0;
    int numberOfFiles3 = 0;

    SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

    public Monitor(String file) {
        this.file = file;
    }

    public void start() {

        while (true) {
            File f = new File(file);
            numberOfFiles1 = f.listFiles().length;
            if (numberOfFiles1 > numberOfFiles2) {
                for (int i = numberOfFiles3; i < numberOfFiles1 - numberOfFiles2 + numberOfFiles3; i++) {
                    System.out.println("File added: " + f.listFiles()[i] +
                            " Date of the creation: " + sdf.format(new Date(f.listFiles()[i].lastModified())));
                }
                numberOfFiles2 = numberOfFiles1;
                numberOfFiles3 = numberOfFiles1;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}