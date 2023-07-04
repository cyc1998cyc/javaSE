package com.chen.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
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
//        test12();
//        test14();
//        test15();
//        test17();
        test18();

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

    private static Auther getOneAuther() {
        return new Auther(12L, "陈宇超", 14, "好看", new ArrayList<Book>());
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

    public static void test13() {
        //获取一个map集合，key为作者名，value为List<Book>
        System.out.println(getAuther().stream()
                .distinct()
                .collect(Collectors.toMap(Auther::getName, Auther::getBooks)));
    }

    /**
     * 判断是否有年龄在29以上的作家
     * allMatch noMatch 一样
     */
    public static void test14() {
        System.out.println(getAuther().stream()
                .anyMatch(auther -> {
                    if (auther.getAge() < 13) {
                        return true;
                    }
                    return false;
                }));

    }

    /**
     * 获取任意一个大于18岁的作家，如果存在输出他的名字
     */
    public static void test15() {
        Optional<Auther> autherOptional = getAuther().stream()
                .filter(auther -> auther.getAge() > 18)
                .findAny();

        autherOptional.ifPresent(auther -> System.out.println(auther.getName()));

    }

    /**
     * 使用reduce求所有作者的年龄的和
     */
    public static void test16() {
        System.out.println(getAuther().stream()
                .map(auther -> auther.getAge())
                .reduce(0, (integer, integer2) -> integer + integer2));

    }

    /**
     * 使用reduce求所有作者中的年龄最大值
     */
    public static void test17() {
        System.out.println(getAuther().stream()
                .map(auther -> auther.getAge())
                .reduce(Integer.MIN_VALUE, new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer integer, Integer integer2) {

                        return integer < integer2 ? integer2 : integer;
                    }
                }));

    }

    public static void test18() {
        Auther auther = getOneAuther();
        Optional<Auther> autherOptional = Optional.ofNullable(auther);
        autherOptional.ifPresent(auther1 -> System.out.println(auther.getName()));
    }


}
