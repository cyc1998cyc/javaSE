package com.chen.lambda;

import java.util.function.IntBinaryOperator;

/**
 * @author cyc
 * @createTime 2023/4/12 22:55
 * @description
 */

public class Test02 {
    public static void main(String[] args) {
        System.out.println(calculateNum(new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                return left - right;
            }
        }));

        System.out.println(calculateNum((a, b) -> {
            return a - b;
        }));
    }


    public static int calculateNum(IntBinaryOperator intBinaryOperator){
        int a = 10;
        int b = 20;
        return intBinaryOperator.applyAsInt(a,b);
    }
}
