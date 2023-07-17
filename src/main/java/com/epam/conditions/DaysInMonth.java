package com.epam.conditions;

import java.util.HashMap;
import java.util.Map;

public class DaysInMonth {

    public void printDays(int year, int month) {
        boolean isLeap;

        Map<Integer, Integer> daysInMonths = new HashMap<>();

        daysInMonths.put(1, 31);
        daysInMonths.put(2, 28);
        daysInMonths.put(3, 31);
        daysInMonths.put(4, 30);
        daysInMonths.put(5, 31);
        daysInMonths.put(6, 30);
        daysInMonths.put(7, 31);
        daysInMonths.put(8, 31);
        daysInMonths.put(9, 30);
        daysInMonths.put(10, 31);
        daysInMonths.put(11, 30);
        daysInMonths.put(12, 31);

        if (year < 0 || month < 0 || month > 12) {
            System.out.println("invalid date");
        } else {

            isLeap = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

            int days = daysInMonths.get(month);
            if (isLeap) days += 1;

            System.out.println(days);
        }


    }

}
