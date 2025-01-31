package org.example;

public class StringDemo {

    private final int ITERATIONS;

    public StringDemo(int iterations) {
        this.ITERATIONS = iterations;
    }

    public void measureStringConcatenation() {
        long startTime = System.nanoTime();
        String result = "";
        for (int i = 1; i < ITERATIONS; i++) {
            result += i*i%(2*i);  // String concatenation
        }
        long endTime = System.nanoTime();
        double timeInSeconds = (endTime - startTime) / 1_000_000_000.0;
        System.out.println("Time taken for String concatenation: " + (timeInSeconds) + " seconds");
    }

    public void measureStringBuilder() {
        long startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < ITERATIONS; i++) {
            sb.append(i*i%(2*i));  // Using StringBuilder
        }
        long endTime = System.nanoTime();
        double timeInSeconds = (endTime - startTime) / 1_000_000_000.0;

        System.out.println("Time taken for StringBuilder: " + (timeInSeconds) + " seconds");
    }
}
