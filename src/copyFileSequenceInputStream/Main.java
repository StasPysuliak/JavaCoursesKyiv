package copyFileSequenceInputStream;

public class Main {
    public static void main(String[] args) {

        CopyFSS copyFSS = new CopyFSS();
        copyFSS.setIs1("C:\\Users\\Stanislav\\Desktop\\Monitor\\1.txt");
        copyFSS.setIs2("C:\\Users\\Stanislav\\Desktop\\Monitor\\2.txt");
        copyFSS.setOut("C:\\Users\\Stanislav\\Desktop\\Monitor\\dest.txt");

        try {
            copyFSS.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
