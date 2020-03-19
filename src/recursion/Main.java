package recursion;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    private static void listAll(String path, ArrayList<String> res) throws IOException {
        File dir = new File(path);
        File[] list = dir.listFiles();

        for (File f : list) {
            String filename = f.getName();

            boolean fileIf = filename.lastIndexOf('.') >= 5 && filename.charAt(1) == 'A';
            boolean directoryIf = filename.length() > 4 && filename.charAt(1) == 'A';

            if (fileIf && f.isFile()) {
                res.add("File: " + f.getCanonicalPath());
            } else if (directoryIf && f.isDirectory()){
                res.add("Directory: " + f.getCanonicalPath());
                listAll(f.getCanonicalPath(), res);
            } else if (f.isDirectory()) {
                listAll(f.getCanonicalPath(), res);
            }
        }
    }

    public static void main(String[] args) {
        final String path = "C:\\Users\\Stanislav\\Desktop\\Monitor";
        ArrayList<String> res = new ArrayList<String>();

        try {
            listAll(path, res);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String s : res)
            System.out.println(s);
    }
}
