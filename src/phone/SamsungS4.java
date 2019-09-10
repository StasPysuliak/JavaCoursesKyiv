package phone;

public class SamsungS4 extends Phone {
    public SamsungS4() {
        System.out.println("SamsungS4 constructor");
        hasWifi = true;
        screenSize = 5;
        number = 0044;
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("Nokia3310 class is sending sms " + message + " Hello " +  " to " + number);
    }
}
