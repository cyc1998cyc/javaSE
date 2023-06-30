package com.chen;

import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/**
 * 省略规则
 * 参数类型可以省略
 * 方法体只有一句代码时，大括号return和唯一一句代码的分号可以省略
 * 方法只有一个参数时，小括号可以省略
 */
public class Test {
    public static void main(String[] args) {
//        new Thread(() ->{
//            System.out.println("jiansheng");
//        }).start();

//        System.out.println(calculateNum((a, b) -> {
//            if (a > b) {
//                return 1;
//            } else {
//                return 0;
//            }
//        }));

//        printNum((a) -> {
//            if (a < 5) {
//                return false;
//            }
//            return true;
//        });

//        System.out.println(typeConver(new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                return Integer.valueOf(s);
//            }
//        }));

//        Integer integer = typeConver((s) -> {
//            return Integer.valueOf(s);
//        });
//
//        System.out.println(integer);

//        foreachArr(new IntConsumer() {
//            @Override
//            public void accept(int value) {
//                System.out.println(value + 1);
//            }
//        });

        foreachArr((i) -> {
            System.out.println(i + 1);
        });


    }

    public static int calculateNum(IntBinaryOperator operator) {
        int a = 40;
        int b = 20;
        return operator.applyAsInt(a, b);
    }

    public static void printNum(IntPredicate predicate) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            if (predicate.test(i)) {
                System.out.println(i);
            }
        }
    }

    public static <R> R typeConver(Function<String, R> function) {
        String str = "1234";
        R result = function.apply(str);
        return result;
    }

    public static void foreachArr(IntConsumer intConsumer) {
        int[] arr = {1, 2, 4, 5, 6, 7, 8};
        for (int i : arr) {
            intConsumer.accept(i);
        }
    }

}
