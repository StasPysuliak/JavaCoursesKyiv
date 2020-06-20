package translator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//Написать программу переводчик, которая будет переводить текст, написанный на одном языке,
// на другой язык согласно заранее составленному словарю.
//* Сделать ф-ю ручного наполнения словаря и возможность его сохранения на диск.
public class Main {
    public static void main(String[] args) {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Dictionary dictionary = new Dictionary();
        String word;
        String translate;



        for (;;) {
            System.out.println("0.exit");
            System.out.println("1.ukr to eng");
            System.out.println("2.eng to ukr");
            System.out.println("3.add new word");
            System.out.println("4.save");
            System.out.println("5.read");
            try {
                switch (Integer.parseInt(bf.readLine())) {
                    case (0): return;
                    case (1): {
                        System.out.print("ukr word: ");
                        word = bf.readLine();
                        translate = dictionary.ukrTranslate(word);
                        if (translate != "")
                            System.out.println(word + " = " + translate);
                        else
                            System.out.println("word is absent");
                        break;
                    }
                    case (2): {
                        System.out.print("eng word: ");
                        word = bf.readLine();
                        translate = dictionary.engTranslate(word);
                        if (translate != "")
                            System.out.println(word + " = " + translate);
                        else
                            System.out.println("word is absent");
                        break;
                    }
                    case (3): {
                        System.out.println("write in new word and translate ");
                        System.out.println("example: двері = door");
                        word = bf.readLine();
                        if (!word.equals("") && word.indexOf(" = ") > 0) {
                            dictionary.addWordToDictionary(word);
                        } else {
                            System.out.println("incorrect entry");
                        }
                        break;
                    }
                    case (4): {
                        new DictionarySerialization().dictionarySerialization(dictionary,"dictionary.txt");
                        break;
                    }
                    case (5): {
                        dictionary = new DictionarySerialization().dictionaryDeserialization("dictionary.txt");
                        break;
                    }

                }
            } catch (Exception e) {
                ;
            }
        }
    }
}
