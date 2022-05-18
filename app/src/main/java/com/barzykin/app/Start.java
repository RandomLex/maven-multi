package com.barzykin.app;

import com.barzykin.calc.ArithmeticCalculator;
import com.barzykin.utils.InputUtils;

public class Start {
    public static void main(String[] args) {
        String action = InputUtils.readStr();
        int a = InputUtils.readInt();
        int b = InputUtils.readInt();

        System.out.println(ArithmeticCalculator.action(action, a, b));
    }
}
