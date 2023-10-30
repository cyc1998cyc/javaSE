package com.chen;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {

        BigDecimal bigDecimal = new BigDecimal(5);

        System.out.println(bigDecimal.subtract(new BigDecimal(2)).subtract(new BigDecimal(1)));

        Long a = 100L;
        Long b = 100L;

        int i = a.compareTo(b);
        System.out.println(i);
    }
}
