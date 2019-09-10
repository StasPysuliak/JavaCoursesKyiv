package rectangle;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int height = scanner.nextInt();  //4
    int width  = scanner.nextInt();  //4

        for(int i = 0; i < height; i++){
            if(i == 0 || i == height - 1) {
                for (int j = 0; j < width; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            else{
            System.out.print("*");
            for (int j=0;j<width-2;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        }
    }
}
