package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {

        int sum = 0;

        for(;number != 0; number /= 10) {
            int digit = number % 10;
            sum += digit;
        }

        System.out.println(sum);

    }

}
