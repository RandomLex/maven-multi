package com.barzykin.calc;

import java.util.Locale;

public class ArithmeticCalculator {

    private ArithmeticCalculator() {
        // prevents object creation
    }

    public static int action(String s, int a, int b) {
        String symbol = s.toLowerCase(Locale.ROOT);
        switch (symbol) {
            case "+":
                return sum(a, b);
            case "-":
                return sub(a, b);
            default:
                throw new IllegalArgumentException("Action should be '+' or '-', but was: " + symbol);
        }
    }

    private static int sum(int a, int b) {
        return a + b;
    }

    private static int sub(int a, int b) {
        return a - b;
    }
}
