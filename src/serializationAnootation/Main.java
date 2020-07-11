package serializationAnootation;
//Написать код, который сериализирует и десериализирует в/из файла все значения полей класса,
// которые отмечены аннотацией @Save.
public class Main {
    public static void main(String[] args) throws Exception {
        Test test = new Test();
        test.setSomeInt(12);
        test.setSomeText("aaaaa");

        Serialization.serializer(test,"1.txt");
        //System.out.println(res);

        test = Serialization.deserialize(Test.class,"1.txt");
        System.out.println(test.getSomeInt() + ", " + test.getSomeText() + ", " + test.getSomeLong() );
    }
}
