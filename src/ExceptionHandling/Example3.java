package ExceptionHandling;

import java.io.*;

public class Example3 {
    public static void methodA() {
        try {
            methodB();
        } catch (Exception e) {
            System.out.println("Exception caught in methodA");
        }
    }

    public static void methodB() throws IOException {
        throw new IOException();
    }

    public static void main(String[] args) {
        methodA();
    }
}
