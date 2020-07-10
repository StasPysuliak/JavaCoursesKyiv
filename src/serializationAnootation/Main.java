package serializationAnootation;

import java.io.Serializable;

public class Main {
    public static void main(String[] args) throws Exception {
        Test test = new Test();
        test.setSomeInt(12);
        test.setSomeText("aaaaa");
        String res = Serialization.serialization(test);
        System.out.println(res);
    }
}
