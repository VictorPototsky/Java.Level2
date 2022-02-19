package lesson2;

import java.io.IOException;

public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException() {
    }

    public MyArraySizeException(String message) {
        super(message);
    }
}
