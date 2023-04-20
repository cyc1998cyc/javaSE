package com.chen.lambda;

import java.util.function.IntPredicate;

/**
 * @author cyc
 * @createTime 2023/4/12 23:03
 * @description
 */

public class Test03 {
    public static void main(String[] args) {

        printNum(value -> {
            if (value > 5){
                return true;
            }
            return false;
        });

        System.out.println("----------------------");

        printNum(a ->{
            if (a>5){
                return false;
            }else{
                return true;
            }
        });

    }

    public static void printNum(IntPredicate intPredicate){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for (int i : arr) {
            if (intPredicate.test(i)){
                System.out.println(i);
            }
        }
    }
}
