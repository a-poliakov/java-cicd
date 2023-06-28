package org.example;

public class Calcalator {
    int sum(int a, int b) {
        return a + b;
    }

    int sub(int a, int b) {
        if (a < b) {
            throw new RuntimeException();
        }
        return a - b;
    }
}
