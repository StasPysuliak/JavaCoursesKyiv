package fileInfo;
//Написать программу, которая создаст текстовый файл и запишет в него список файлов (путь, имя, дата создания) из заданного каталога.
public class Main {
    public static void main(String[] args) {

        FileInfo fileInfo = new FileInfo();
        fileInfo.setIs("C:\\Users\\Stanislav\\Desktop\\Monitor");
        fileInfo.setOut("C:\\Users\\Stanislav\\Desktop\\Monitor\\FileInfo.txt");
        try {
            fileInfo.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
