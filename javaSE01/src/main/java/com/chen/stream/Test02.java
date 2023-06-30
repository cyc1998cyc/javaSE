package com.chen.stream;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Test02 {
    public static void main(String[] args) {
        test();
    }

    public static void test(){
        Integer[] arr = {1,2,3,4,5};
        Stream<Integer> stream = Arrays.stream(arr);
        stream.distinct()
                .filter(integer -> integer<2)
                .forEach(integer -> System.out.println(integer));
    }
}
