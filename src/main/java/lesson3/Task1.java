package lesson3;

import java.util.*;

public class Task1 {

    public static void main(String[] args) {
        List<String> animals = new ArrayList<>(Arrays.asList("Hamster", "Deer", "Cat", "Hedgehog", "Bear", "Dog", "Racoon", "Mouse", "Horse",
                "Cat", "Mouse", "Moose", "Racoon", "Dog", "Hamster", "Fox", "Wolf", "Bear"));
        Set<String> hs;

        System.out.println("Первоначальный массив (размер - " + animals.size() + ") : " + animals);
        hs = makeUniqueList(animals);
        System.out.println("Массив уникальных слов  : " + hs);
        countItems(hs, animals);
    }

    private static void countItems(Set<String> hs, List<String> list) {
        Iterator<String> iterator = hs.iterator();

        while (iterator.hasNext()) {
            String str = iterator.next();
            int i = 0;
            for (String st : list) {
                if (st.equals(str)) {
                    i++;
                }
            }
            System.out.println("Элемент  " + str + "  :  Количество повторений - " + i);
        }
    }

    private static Set<String> makeUniqueList(List<String> list) {
        Iterator<String> iterator = list.iterator();
        Set<String> hs = new LinkedHashSet<>();

        while (iterator.hasNext()) {
            hs.add(iterator.next());
        }
        return hs;
    }
}




