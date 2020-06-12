import java.awt.*;
import javax.swing.*;

class Gr1 extends JFrame{

    Gr1(String s){
        super(s);
        setLayout(null);
        setSize(300,500);
        setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint(Graphics my_picture){
        my_picture.setColor(Color.LIGHT_GRAY);
        my_picture.fillRect(0, 0, 300, 500);
        my_picture.setColor(Color.BLACK);
        my_picture.drawOval(90, 50, 100, 100);
        my_picture.drawLine(140, 150, 140, 300);
        my_picture.drawLine(140, 300, 100, 400);
        my_picture.drawLine(140, 300, 180, 400);
        my_picture.drawLine(140, 200, 75, 250);
        my_picture.drawLine(140, 200, 205, 250);
    }

    public static void main(String[] args) {
        new Gr1("");
    }
}
