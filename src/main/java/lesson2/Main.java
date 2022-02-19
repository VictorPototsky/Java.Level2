package lesson2;

public class Main {
    private static String[][] arr = {
            {"4", "2", "6", "12"},
//            {"11", "7", "5","j5.5"},
            {"9", "5", "3", "1"},
            {"7", "4", "8", "5"},
//            {"2","5","8","0.1"},
            {"10", "1", "1", "2"}};
    private static Exception e;

    public static void main(String[] args) throws Exception {

        try {
            System.out.println(test(arr));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("\n" + e);
        }
    }

    private static String test(String arr[][]) throws Exception {
        String str;
        int result = 0;
        int rows;
        int columns;
        if (arr != null) {
            rows = arr.length;
            columns = arr[0].length;
            for (int i = 1; i < rows; i++) {
                if (arr[i].length > columns) {
                    columns = arr[i].length;
                }
            }
        } else {
            throw new MyArraySizeException("Массив данных не определен!!!!");
        }
        if (rows!=4 || columns!=4) {
            throw new MyArraySizeException("Исключение по размеру массива!!! Размерность массива : " + rows + " x " + columns);
        } else {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    try {
                        result += Integer.parseInt(arr[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException("Некорректные данные в ячейке [" + i + "][" + j + "]. Значение : "+arr[i][j]);
                    }
                }
            }
            str = "Сумма элементов массива : " + result;
        }
        return str;
    }

}
