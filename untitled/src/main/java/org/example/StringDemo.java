package org.example;

public class StringDemo {

    private final int ITERATIONS;

    public StringDemo(int iterations) {
        this.ITERATIONS = iterations;
    }

    public static long measureStringConcatenation(int iterations) {
        long startTime = System.nanoTime();
        String result = "";
        for (int i = 0; i < iterations; i++) {
            result += "a";  // String concatenation
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long measureStringBuilder(int iterations) {
        long startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append("a");  // Using StringBuilder
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
