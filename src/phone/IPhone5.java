package phone;

public class IPhone5 extends IPhone {
    public IPhone5() {
        System.out.println("IPhone5 constructor");
        screenSize = 4;
        imei = "1111111";
        number = 0022;
    }
    /*@Override
    public void call(String number) {
    System.out.println("IPhone class is calling " + number);
    }*/ // ошибка т.к. метод final
    @Override
    public void sendSMS(String number, String message) {
        super.sendSMS(number, message);
        System.out.println("IPhone5 class is sending sms " + message + " to " + number);
    }
}