package arrysStorage;

import java.util.ArrayList;
import java.util.List;

public class ArraysStorage<E> {

    private List<E> storage = new ArrayList();

    public void setStorage(E[] storage) {

        for (E value : storage) {
            this.storage.add(value);
        }

    }

    public E getStorage(int index) throws Exception {

        if (index < 0 || index >= storage.size())
            throw new Exception("Выход за границу массива");
        else
            return storage.get(index);

    }

}
