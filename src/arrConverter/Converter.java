package arrConverter;

import java.util.ArrayList;

public class Converter<V> {
    V[] value;
    private ArrayList<V> list = new ArrayList<>();

    public Converter(V[] value) {
        this.value = value;
    }

    public ArrayList convert() {
        for (int i = 0; i < value.length; i++) {
            list.add(value[i]);
        }
        return list;
    }
}
