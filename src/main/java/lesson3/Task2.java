package lesson3;

public class Task2 {

    public static void main(String[] args) {

        PB.add("Black", "777-12-12");
        PB.add("Johnson", "332-11-22");
        PB.add("Smith", "225-11-11");
        PB.add("White", "111-000-0");
        PB.add("Green", "156-15-15");
        PB.add("Brown", "756-00-00");
        PB.add("Jackson", "225-10-10");
        PB.add("Robertson", "555-55-55");
        PB.add("White", "111-13-12");
        PB.add("Green", "155-10-10");
        PB.add("Smith", "225-12-12");
        PB.add("Black", "777-77-77");

        for (String s : PB.phoneBook.keySet()) {
            System.out.println("Фамилия : " + s + "\n  Телефон(ы) : " + PB.phoneBook.get(s));
        }
    }

}

