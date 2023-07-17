package com.epam.conditions;

import java.sql.SQLOutput;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {

        if (divider == 0) {
            System.out.println("division by zero");
        } else {
            int dividingResult = dividend / divider;

            int multiply = dividingResult * divider;

            if (multiply == dividend) {
                System.out.println("can be divided completely");
            } else System.out.println("cannot be divided completely");
        }


    }

}
