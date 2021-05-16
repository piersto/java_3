package ca.qc.yul.pst.sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        String[] langs = new String[4];
        langs[0] = "Java";
        langs[1] = "Python";
        langs[2] = "C++";
        langs[3] = "Ruby";

        List<String> languages = new ArrayList<String>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("Russian");

        for (String lang : langs) {
            System.out.println(lang);
        }
        System.out.println("--------------------");

        for (int i = 0; i < langs.length; i++) {
            System.out.println(langs[i]);
        }
        System.out.println("--------------------");

        for (String language : languages) {
            System.out.println(language);
        }
        System.out.println("--------------------");

        List<String> languages2 = Arrays.asList("Java", "Python", "Ruby", "Japanese");

        for (int i = 0; i < languages2.size(); i++) {
            System.out.println(languages2.get(i));
        }

        for (int i = 0; i < languages.size(); i++) {
            System.out.println(languages.get(i));
        }
    }
}
