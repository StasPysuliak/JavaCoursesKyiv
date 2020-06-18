package arrysStorage;
//Написать класс, который умеет хранить в себе массив
//любых типов данных (int, long etc.). Реализовать метод,
//который возвращает любой элемент массива по индексу.
public class Main {
    public static void main(String[] args) {

        Integer[] intNum = {1, 2, 3};
        Long[] longNum = new Long[3];
        Double[] doubleNum = new Double[3];
        String[] str = {"aaa", "bbb", "ccc"};

        for (int i = 0; i < 3; i++) {
            longNum[i] = (long) i + 4;
            doubleNum[i] = (double) i + 7;
        }

        ArraysStorage intSorage = new ArraysStorage();
        ArraysStorage longSorage = new ArraysStorage();
        ArraysStorage doubleSorage = new ArraysStorage();
        ArraysStorage stringSorage = new ArraysStorage();

        intSorage.setStorage(intNum);
        longSorage.setStorage(longNum);
        doubleSorage.setStorage(doubleNum);
        stringSorage.setStorage(str);

        try {
            System.out.println(intSorage.getStorage(0));
            System.out.println(longSorage.getStorage(1));
            System.out.println(doubleSorage.getStorage(2));
            System.out.println(stringSorage.getStorage(1));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
