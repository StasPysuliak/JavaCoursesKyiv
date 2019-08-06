public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.setR(12);
        System.out.println(circle.area());

        StaticCounter staticCounter = new StaticCounter();
        for(int i = 0; i < 10; i++) {
              new StaticCounter();
        }
        System.out.println(staticCounter.i);

        


    }
}
