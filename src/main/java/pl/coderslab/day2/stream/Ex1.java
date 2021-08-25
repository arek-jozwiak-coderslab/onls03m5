package pl.coderslab.day2.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Ex1 {

    public static void main(String[] args) {
        List<String> strings = List.of("az", "sss", "tttt", "abbbb", "abbbb", "ddddd");
        strings.stream()
                .filter(s -> s.startsWith("a") || s.startsWith("s"))
//                .peek(System.out::println)
                .map(s -> s.toUpperCase())
                .sorted()
                .forEach(System.out::println);

        System.out.println("----------");
        List<String> collect = strings.stream()
                .distinct()
                .filter(s -> s.length() == 5)
                .collect(Collectors.toList());

        collect.forEach(System.out::println);

        System.out.println("----------");

        String collect1 = strings.stream()
                .sorted()
                .map(s -> s.substring(0, 3))
                .collect(Collectors.joining(","));

        System.out.println(collect1);

    }
}
