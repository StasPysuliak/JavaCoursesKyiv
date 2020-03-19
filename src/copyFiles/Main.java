package copyFiles;

public class Main {
    public static void main(String[] args) {
        CopyFifesFirstWay copyFifesF = new CopyFifesFirstWay();
        copyFifesF.setIs("C:\\Users\\Stanislav\\Desktop\\Monitor\\1.txt");
        copyFifesF.setOut("C:\\Users\\Stanislav\\Desktop\\To\\1.txt");
        try {
            copyFifesF.copy();
        } catch (Exception e) {
            e.printStackTrace();
        }

        CopyFilesSecondWay copyFilesS = new CopyFilesSecondWay();
        copyFilesS.setIs("C:\\Users\\Stanislav\\Desktop\\Monitor\\1.txt");
        copyFilesS.setOut("C:\\Users\\Stanislav\\Desktop\\To\\2.txt");
        try {
            copyFilesS.copy();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
