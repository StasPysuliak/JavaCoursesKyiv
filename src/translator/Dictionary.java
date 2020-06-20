package translator;

import java.io.Serializable;
import java.util.HashMap;

public class Dictionary implements Serializable {

    private String[] ukrWord = {"нуль", "один", "два", "три", "чотири", "п'ять", "шість", "сім", "вісім", "дев'ять"};
    private String[] engWord = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private String[] newWord;
    private HashMap<Integer, String> ukrDict = new HashMap<>();
    private HashMap<Integer, String> engDict = new HashMap<>();
    private int numberOfWords = 10;

    public Dictionary() {
        for (int i = 0; i < numberOfWords; i++) {
            ukrDict.put(i, ukrWord[i]);
            engDict.put(i, engWord[i]);
        }
    }

    public String ukrTranslate (String word) {
        for (int i = 0; i < numberOfWords; i++) {
            if (ukrDict.get(i).equals(word))
                return engDict.get(i);
        }
        return "";
    }

    public String engTranslate (String word) {
        for (int i = 0; i < numberOfWords; i++) {
            if (engDict.get(i).equals(word))
                return ukrDict.get(i);
        }
        return "";
    }

    public void addWordToDictionary (String word) {
        newWord = word.split(" = ");
            ukrDict.put(numberOfWords, newWord[0]);
            engDict.put(numberOfWords, newWord[1]);
            numberOfWords++;
            System.out.println("word added");
    }


}
