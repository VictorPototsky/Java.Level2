package lesson3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PB {

    public static Map<String, List<String>> phoneBook = new HashMap<>();

    public static void add(String surname, String number) {

        List<String> pn = new ArrayList<>();
        if (!phoneBook.isEmpty()) {
            pn = checkSurname(surname);
        }
        pn.add(number);
        phoneBook.put(surname, pn);
    }

    private static List<String> checkSurname(String surname) {
        List<String> list = new ArrayList<>();
        if (phoneBook.containsKey(surname)) return phoneBook.get(surname);
        else return list;
    }

    public static List<String> get(String surname) {
        return phoneBook.get(surname);
    }

}
