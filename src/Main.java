import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        String tex;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        bf.readLine().split(" ");

        System.out.println(bf.readLine().split(" ")[0]);
        System.out.println(bf.readLine().split(" ")[1]);
        System.out.println(bf.readLine().split(" ")[2]);
    }
}
