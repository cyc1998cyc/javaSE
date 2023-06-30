package com.chen.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
//        List<Auther> authers = getAuther();
//        System.out.println(authers);

//        authers.stream()//把集合转换成流
//                .distinct()//去重
//                .filter(auther -> auther.getAge()<1)
//                .forEach(auther -> System.out.println(auther.getName()));
//        test11();
        test12();


    }

    private static List<Auther> getAuther() {

        ArrayList<Book> books = new ArrayList<Book>();
        for (int i = 0; i < 4; i++) {
            Book book = new Book();
            book.setId((long) i);
            book.setName("小说" + i);
            book.setCategory("言情");
            book.setIntro("好看");
            book.setScore(99);

            books.add(book);
        }

        ArrayList<Auther> authers = new ArrayList<Auther>();

        for (int i = 0; i < 5; i++) {
            Auther auther = new Auther();
            auther.setBooks(books);
            auther.setId((long) i);
            auther.setAge(11 + i);
            auther.setName("jiansheng" + i);
            auther.setIntro("牛逼的作者");
            authers.add(auther);
        }


        return authers;
    }

    public static void test08() {
        List<Auther> authers = getAuther();
        authers.stream()
                .distinct()
                .sorted((o1, o2) -> o1.getAge() - o2.getAge())
                .limit(2)
                .skip(2)
                .forEach(auther -> System.out.println(auther.getAge()));

    }

    public static void test09() {
        List<Auther> authers = getAuther();
        authers.stream()
                .flatMap((Function<Auther, Stream<Book>>) auther -> auther.getBooks().stream())
                .distinct()
                .forEach(o -> System.out.println(o.getName()));

    }

    public static void test10() {
        getAuther().stream()
                .flatMap(auther -> auther.getBooks().stream())
                .distinct()
                .flatMap(book -> Arrays.stream(book.getCategory().split(",")))
                .distinct()
                .forEach(category -> System.out.println(category));
    }

    /**
     * 获得存放所有作者名字的集合
     */
    public static void test11() {
        System.out.println(getAuther().stream()
                .map(auther -> auther.getName())
                .collect(Collectors.toList()));

    }

    public static void test12() {
        System.out.println(getAuther().stream()
                .flatMap(auther -> auther.getBooks().stream())
                .map(book -> book.getName())
                .collect(Collectors.toList()));


    }


}
