package com.pluralsight;

import java.math.BigDecimal;

public class MoneyMath {
    public static void main(String[] args) {
        float floatZero = 0;
        double doubleZero = 0.0;
        BigDecimal bigDecimalZero = BigDecimal.ZERO;

        for (int i = 0; i < 10; i++) {
            floatZero += 0.10;
            doubleZero += 0.10;
            bigDecimalZero = bigDecimalZero.add(new BigDecimal("0.10"));
            System.out.println(floatZero+" "+doubleZero+" "+bigDecimalZero);
        }
        floatZero = 0;
        doubleZero = 0.0;
        bigDecimalZero = BigDecimal.ZERO;

        for (int i = 0; i < 1000; i++) {
            floatZero += 19.99;
            doubleZero += 19.99;
            bigDecimalZero = bigDecimalZero.add(new BigDecimal("19.99"));
            System.out.println(floatZero+" "+doubleZero+" "+bigDecimalZero);
        }
        System.out.println(floatZero==doubleZero);
        System.out.println(bigDecimalZero.compareTo(new BigDecimal(floatZero)));
        System.out.println(bigDecimalZero.compareTo(new BigDecimal(doubleZero)));

        // The float is off by 184 cents after 1000 passes

        // BigDecimal prints 1.00 instead of 1 because BigDecimal maintains the decimal scale

        // If you call .add() without assigning the result back the new value is lost and only the original remains
    }

}
