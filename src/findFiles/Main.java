package findFiles;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    static class MyFileFilter implements FilenameFilter {
        private String ext;
        public MyFileFilter(String ext) {
            this.ext = ext;
        }
        public boolean accept(File dir, String name) {
            return name.endsWith(ext);
        }
    }

    private static void findFiles(String srcPath, String[] ext, ArrayList<String> list) throws IOException {
        File dir = new File(srcPath);
        for (String e : ext) {
            File[] files = dir.listFiles(new MyFileFilter(e));
            for (int i = 0; i < files.length; i++) {
                list.add (files[i].getCanonicalPath());
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        String[] ext = {".txt",".pdf",".iso"};
        try {
            findFiles("C:\\Users\\Stanislav\\Desktop\\Monitor", ext, list);
        } catch (IOException ex) {}
        for (String s : list)
            System.out.println(s);
    }
}